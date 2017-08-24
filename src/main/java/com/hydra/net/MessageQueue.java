package com.hydra.net;


import com.hydra.net.entries.Message;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MessageQueue {

    private static MessageQueue instance;

    private Queue<Message> messageQueue;

    public void put(Message message){
        try {
            this.messageQueue.offer(message);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public Message poll(){
        try {
            return this.messageQueue.poll();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public MessageQueue(){
        messageQueue = new ConcurrentLinkedQueue<Message>();
    }

    public int getSize(){
        return this.messageQueue.size();
    }



}
