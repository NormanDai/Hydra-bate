package com.hydra.net.entries.impl;


import com.hydra.common.enums.MessageTypeEnum;
import com.hydra.net.entries.Message;

public class RemoteJobInvokeMessage implements Message<ProtocolEntry> , java.io.Serializable{

    private ProtocolEntry protocolEntry;

    public void put(ProtocolEntry protocolEntry) {
        this.protocolEntry = protocolEntry;
    }

    public ProtocolEntry get() {
        return protocolEntry;
    }

    public MessageTypeEnum getType() {
        return protocolEntry.getMessageType();
    }
}
