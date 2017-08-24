package com.hydra.net.handler;


import com.hydra.net.entries.Address;
import com.hydra.net.entries.Message;
import com.hydra.net.entries.impl.ProtocolEntry;

public abstract class OutBoradHandler<T extends Message<ProtocolEntry>> implements Runnable{

    protected T message;

    protected Address address;

    /**
     * 设置消息实体
     * @param address
     * @param message
     */
    public void setMessageBody(Address address , T message){
        this.address = address;
        this.message = message;
    }

    public void run() {
        sendMessage();
    }

    protected abstract void sendMessage();

}
