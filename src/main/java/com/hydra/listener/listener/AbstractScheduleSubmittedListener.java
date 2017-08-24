package com.hydra.listener.listener;


import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.hydra.listener.BatchSystemEvent;
import com.hydra.listener.BatchSystemListener;
import com.hydra.listener.event.ScheduleSubmittedEvent;

public abstract class AbstractScheduleSubmittedListener implements BatchSystemListener{

    @Subscribe
    @AllowConcurrentEvents
    public void eventHandler(BatchSystemEvent event) {
        if(event instanceof ScheduleSubmittedEvent){
            eventProcess((ScheduleSubmittedEvent)event);
        }
    }
    abstract void eventProcess(ScheduleSubmittedEvent event);
}
