package com.hydra.listener.listener;


import com.hydra.invoke.JobMannagerMonitor;
import com.hydra.listener.event.JobManagerStartEvent;

public class JobManagerListener extends AbstractEventListener<JobManagerStartEvent>{

    @Override
    public void eventProcess(JobManagerStartEvent jobManagerStartEvent) {
        Thread managerThread = jobManagerStartEvent.getManagerThread();
        Thread monitorThread = new Thread(new JobMannagerMonitor(managerThread));
        monitorThread.setName("Hydra-JobManagerListener-Monitor");
        monitorThread.start();
    }
}
