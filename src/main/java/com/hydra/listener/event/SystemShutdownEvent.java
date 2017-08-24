package com.hydra.listener.event;


import com.hydra.entries.RuntimeJobGraphContextEntry;
import com.hydra.listener.BatchSystemEvent;

public class SystemShutdownEvent implements BatchSystemEvent{//系统请求关机事件



    public Object getProperty() {
        return null;
    }

    public void setProperty(Object object) {}
}
