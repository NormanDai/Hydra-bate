package com.hydra.net;

import lombok.Getter;

@Getter
public class MessagePipeline {

    private MessageQueue inputQueue;

    private MessageQueue outputQueue;

    public MessagePipeline(){
        this.inputQueue = new MessageQueue();
        this.outputQueue = new MessageQueue();
    }

    public int getInputQueueSize(){
        return this.inputQueue.getSize();
    }
    public int getOutputQueueSize(){
        return this.outputQueue.getSize();
    }
}
