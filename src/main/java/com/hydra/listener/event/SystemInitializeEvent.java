package com.hydra.listener.event;


import com.hydra.entries.RuntimeJobGraphContextEntry;
import com.hydra.listener.BatchSystemEvent;

public class SystemInitializeEvent implements BatchSystemEvent{//系统初始化完毕事件

    private RuntimeJobGraphContextEntry graphContextEntry;

    public Object getProperty() {
        return graphContextEntry;
    }

    public void setProperty(Object object) {
        if(object instanceof RuntimeJobGraphContextEntry){
            this.graphContextEntry = (RuntimeJobGraphContextEntry)object;
        }
    }
}
