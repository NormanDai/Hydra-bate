package com.hydra.listener.listener;


import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.hydra.listener.BatchSystemEvent;
import com.hydra.listener.BatchSystemListener;

public abstract class AbstractEventListener<T extends BatchSystemEvent> implements BatchSystemListener{

    @Subscribe
    @AllowConcurrentEvents
    public void eventHandler(BatchSystemEvent event) {
        eventProcess((T)event);
    }

    public abstract void eventProcess(T t);

}
