package com.hydra.listener.event;


import com.hydra.listener.BatchSystemEvent;
import com.hydra.net.entries.Address;
import lombok.Getter;

@Getter
public class RemoteNodeJoinEvent implements BatchSystemEvent{// 远程节点加入集群事件

    private Address address;

    public RemoteNodeJoinEvent(final Address address){
        this.address = address;
    }
}
