package com.hydra.net.jgroups;


import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.hydra.common.utils.P;
import com.hydra.listener.BatchSystemEvent;
import com.hydra.listener.BatchSystemEventBus;
import com.hydra.listener.BatchSystemListener;
import com.hydra.listener.event.RemoteNodeJoinEvent;
import com.hydra.listener.event.RemoteNodeLeaveEvent;
import com.hydra.listener.event.SystemShutdownEvent;
import com.hydra.net.MessagePipeline;
import com.hydra.net.MessageStack;
import com.hydra.net.MessageStackHolder;
import com.hydra.net.entries.impl.JGroupsAddress;
import com.hydra.net.entries.impl.JGroupsCluster;
import com.hydra.net.entries.impl.RemoteJobInvokeMessage;
import org.jgroups.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class JGroupsRemoteAdapter extends ReceiverAdapter implements BatchSystemListener{

    private static JGroupsRemoteAdapter remoteService;

    /**
     * 集群名称.
     */
    private static final String CLUSTER_NAME = "HYDRA-SERVICE";
    /**
     * 节点通道.
     */
    private JChannel channel = null;
    /**
     * 视图操作锁
     */
    private ReentrantLock viewLock = new ReentrantLock();
    /**
     * 事件总线
     */
    private BatchSystemEventBus eventBus = BatchSystemEventBus.getInstance();

    private JGroupsRemoteAdapter(){

        if(null == this.channel){
            try {
                P.println("HYDRA-SERVICE cluster starting ......");
                //添加事件监听
                eventBus.registe(MessageStackHolder.class);
                channel = new JChannel();
                channel.setReceiver(this);
                channel.connect(CLUSTER_NAME);
                channel.getState(null, 10000);
            }catch (Exception e){
                throw new RuntimeException("启动JGroups节点异常!", e);
            }
        }


    }

    @Override
    public void receive(Message remoteMessage) {
        //将消息放入消息管道
        Address srcAddress = remoteMessage.getSrc();
        RemoteJobInvokeMessage invokeMessage = (RemoteJobInvokeMessage) remoteMessage.getObject();
        ConcurrentHashMap<com.hydra.net.entries.Address, MessagePipeline> messageStack = MessageStack.getInstance().getMessageStack();
        for(Map.Entry<com.hydra.net.entries.Address, MessagePipeline> entry : messageStack.entrySet()){

            if(entry.getKey().getAddress().toString().equals(srcAddress.toString())){
                entry.getValue().getInputQueue().put(invokeMessage);
            }
        }

    }

    @Override
    public void viewAccepted(View view) {
        viewLock.lock();
        try {
            JGroupsCluster cluster = JGroupsCluster.getInstance();
            //设置master标识
            if (view.getCreator().toString().equals(this.channel.getAddressAsString())) {
                P.println("Node " + view.getCreator().toString() + " get master authority!");
                cluster.setMaster(true);
            }
            //判断节点状态
            List<Address> members = view.getMembers();
            JGroupsAddress[] clusterMembers = cluster.getMembers();
            if (null != clusterMembers && clusterMembers.length > 0) {
                // 节点加入
                if (members.size() > clusterMembers.length) {
                    com.hydra.net.entries.Address joinNodeAddress = getUnknowNodeAddress(members, clusterMembers);
                    P.println("Remote node join the cluster Node:{}",joinNodeAddress);
                    RemoteNodeJoinEvent nodeJoinEvent = new RemoteNodeJoinEvent(joinNodeAddress);
                    eventBus.publish(nodeJoinEvent);
                } else {//节点离开
                    com.hydra.net.entries.Address leaveNodeAddress = getUnknowNodeAddress(members, clusterMembers);
                    P.println("Remote node leave the cluster Node:{}",leaveNodeAddress);
                    RemoteNodeLeaveEvent nodeLeaveEvent = new RemoteNodeLeaveEvent(leaveNodeAddress);
                    eventBus.publish(nodeLeaveEvent);
                }
                clusterMembers = new JGroupsAddress[members.size()];
                for (int j = 0; j < members.size(); j++) {
                    Address rAddress = members.get(j);
                    JGroupsAddress retAddress = new JGroupsAddress();
                    retAddress.setAddress(rAddress);
                    clusterMembers[j] = retAddress;
                }
                cluster.resetMembers(clusterMembers);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            viewLock.unlock();
        }
    }

    /**
     * 获取节点差集
     * @param members
     * @param clusterMembers
     * @return
     */
    private com.hydra.net.entries.Address getUnknowNodeAddress(List<Address> members , JGroupsAddress[] clusterMembers){

        for(Address remoteAds : members){

            for (int i = 0; i < clusterMembers.length; i++) {
                JGroupsAddress jGroupsAddress = clusterMembers[i];
                Address address = jGroupsAddress.getAddress();
                if(remoteAds.toString().equals(address.toString())){
                    break;
                }
                if(i >= clusterMembers.length - 1){
                    JGroupsAddress retAddress = new JGroupsAddress();
                    retAddress.setAddress(remoteAds);
                    return retAddress;
                }

            }

        }
        return null;
    }

    @Subscribe
    @AllowConcurrentEvents
    public void eventHandler(BatchSystemEvent event) {
        if(event instanceof SystemShutdownEvent){
            if(null != this.channel){
                this.channel.close();
            }
        }
    }

    /**
     * 发送消息
     * @param address
     * @param message
     */
    public void send(Address address , com.hydra.net.entries.Message message){
        if(null != message){
            Message remoteMessage = new Message(address,message);
            try {
                this.channel.send(remoteMessage);
            }catch (Exception e){
                throw new RuntimeException("发送消息异常",e);
            }
        }
    }


    public static JGroupsRemoteAdapter getInstance(){
        if (remoteService == null) {
            synchronized (JGroupsRemoteAdapter.class) {
                if (remoteService == null) {
                    remoteService = new JGroupsRemoteAdapter();
                }
            }
        }
        return remoteService;
    }
}
