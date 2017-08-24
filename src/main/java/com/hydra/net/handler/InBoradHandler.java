package com.hydra.net.handler;


import com.hydra.net.entries.Message;
import com.hydra.net.entries.impl.ProtocolEntry;

public abstract class InBoradHandler<T extends Message<ProtocolEntry>> implements Runnable{

    protected T message;
    /**
     * 接收
     */
    protected abstract void onReceive();

    public void setMessage(T t){
        this.message = t;
    }

    public void run() {
        onReceive();
    }
}
