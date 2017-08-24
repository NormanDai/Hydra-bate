package com.hydra.net;


import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.hydra.invoke.pool.JobRunnerExecutor;
import com.hydra.listener.BatchSystemEvent;
import com.hydra.listener.BatchSystemListener;
import com.hydra.listener.event.RemoteNodeJoinEvent;
import com.hydra.listener.event.RemoteNodeLeaveEvent;
import com.hydra.listener.event.SystemShutdownEvent;
import com.hydra.net.entries.Address;
import com.hydra.net.handler.InBoradHandler;
import com.hydra.net.handler.OutBoradHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class MessageStackHolder  implements Runnable ,BatchSystemListener {

    private MessageStack messageStack = MessageStack.getInstance();

    private AtomicBoolean isShutdown = new AtomicBoolean(false);

    private Executor executor =  JobRunnerExecutor.getInstance().getExecutor();

    public void run() {

        while (!isShutdown.get()){
            ConcurrentHashMap<Address, MessagePipeline> stackMap = messageStack.getMessageStack();
            for(Map.Entry<Address,MessagePipeline> entry : stackMap.entrySet()){
                Address address = entry.getKey();
                MessagePipeline pipeline = entry.getValue();
                this.inboradMessageHolder(pipeline.getInputQueueSize(), pipeline);
                this.outboradMessageHolder(pipeline.getOutputQueueSize(),address, pipeline);
            }
        }
    }

    @Subscribe
    @AllowConcurrentEvents
    public void eventHandler(BatchSystemEvent event) {
        //若新节点加入集群则分配新的管道
        if(event instanceof RemoteNodeJoinEvent){
            RemoteNodeJoinEvent nodeJoinEvent = (RemoteNodeJoinEvent) event;
            assignPipeline(nodeJoinEvent.getAddress());
        }
        //若节点退出当前集群则移除管道
        if(event instanceof RemoteNodeLeaveEvent){
            RemoteNodeLeaveEvent nodeJoinEvent = (RemoteNodeLeaveEvent) event;
            removePipeline(nodeJoinEvent.getAddress());
        }
        //相应系统关闭事件
        if(event instanceof SystemShutdownEvent){
            this.isShutdown.set(true);
        }

    }

    private void inboradMessageHolder(int size,MessagePipeline pipeline){
        if(size > 0){
            for (int i = 0; i < size; i++) {
                InBoradHandler inboradHandler = this.getInboradHandler();
                inboradHandler.setMessage(pipeline.getInputQueue().poll());
                executor.execute(inboradHandler);
            }
        }
    }
    private void outboradMessageHolder(int size,Address address,MessagePipeline pipeline){
        if(size > 0){
            for (int i = 0; i < size; i++) {
                OutBoradHandler outboradHandler = this.getOutboradHandler();
                outboradHandler.setMessageBody(address,pipeline.getOutputQueue().poll());
                executor.execute(outboradHandler);
            }
        }
    }
    private void assignPipeline(Address address){
        this.messageStack.assignPipeline(address);
    }

    private void removePipeline(Address address){
        this.messageStack.removePipeline(address);
    }

    protected abstract InBoradHandler getInboradHandler();

    protected abstract OutBoradHandler getOutboradHandler();


}
