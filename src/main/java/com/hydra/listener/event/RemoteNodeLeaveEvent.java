package com.hydra.listener.event;


import com.hydra.listener.BatchSystemEvent;
import com.hydra.net.entries.Address;
import lombok.Getter;

@Getter
public class RemoteNodeLeaveEvent implements BatchSystemEvent{// 远程节点退出集群事件

    private Address address;

    public RemoteNodeLeaveEvent(final Address address){
        this.address = address;
    }
}
