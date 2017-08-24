package com.hydra.listener.event;


import com.hydra.listener.BatchSystemEvent;
import lombok.Getter;

@Getter
public class JobManagerStartEvent implements BatchSystemEvent{

    private Thread managerThread;

    public JobManagerStartEvent(final Thread managerThread){
        this.managerThread = managerThread;
    }
}
