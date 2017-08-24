package com.hydra.listener.listener;


import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.hydra.common.utils.P;
import com.hydra.entries.RuntimeJobGraphContextEntry;
import com.hydra.listener.BatchSystemEvent;
import com.hydra.listener.BatchSystemListener;
import com.hydra.listener.event.SystemInitializeEvent;

import java.util.Date;

public class SystemInitializeListener implements BatchSystemListener{//系统初始化完毕监听器


    @Subscribe
    @AllowConcurrentEvents
    public void eventHandler(BatchSystemEvent event) {
        if(event instanceof SystemInitializeEvent){
            SystemInitializeEvent initializeEvent = (SystemInitializeEvent) event;
            Object property = initializeEvent.getProperty();
            if(null != initializeEvent.getProperty()){
                RuntimeJobGraphContextEntry graphContextEntry = (RuntimeJobGraphContextEntry) initializeEvent.getProperty();
                //TODO 此部分需要正常的业务处理逻辑
                P.println("BatchSystem initialize over at:{}, RuntimeJobGraphContextEntry:{}",new Date(),graphContextEntry);
            }

        }
    }
}
