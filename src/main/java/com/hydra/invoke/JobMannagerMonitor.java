package com.hydra.invoke;


import com.hydra.listener.BatchSystemEvent;
import com.hydra.listener.Publisher;
import com.hydra.listener.event.JobManagerStartEvent;

public class JobMannagerMonitor extends  ThreadRunningMonitor{

    public JobMannagerMonitor(Thread thread){
        super(thread);
    }

    @Override
    void reBootHandler() {
        //启动作业管理器
        Thread jobManagerThread = new Thread(new JobManagerExecutor());
        jobManagerThread.setName("Hydra-JobManagerExecutor");
        jobManagerThread.start();
        //发布作业管理器启动事件
        new Publisher().publish(new JobManagerStartEvent(jobManagerThread));
    }

}
