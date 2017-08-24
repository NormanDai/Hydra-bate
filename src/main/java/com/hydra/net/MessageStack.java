package com.hydra.net;


import com.hydra.net.entries.Address;
import lombok.Getter;

import java.util.concurrent.ConcurrentHashMap;

@Getter
public class MessageStack {

    private static MessageStack instance;

    private ConcurrentHashMap<Address,MessagePipeline> messageStack = new ConcurrentHashMap<Address, MessagePipeline>();

    public MessagePipeline getPipeline(Address address){
        return messageStack.get(address);
    }

    public void assignPipeline(Address address){
        if(null != address){
            this.messageStack.put(address,new MessagePipeline());
        }
    }

    public void removePipeline(Address address){
        if(null != address){
            this.messageStack.remove(address);
        }
    }

    private MessageStack(){}

    public static MessageStack getInstance(){
        if (instance == null) {
            synchronized (MessageStack.class) {
                if (instance == null) {
                    instance = new MessageStack();
                }
            }
        }
        return instance;
    }
}
