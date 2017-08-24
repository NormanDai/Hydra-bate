package com.hydra.listener;


public class Publisher {// 系统事件发布基类

    private BatchSystemEventBus eventBus = BatchSystemEventBus.getInstance();

    public void publish(BatchSystemEvent event){
        eventBus.publish(event);
    }
}
