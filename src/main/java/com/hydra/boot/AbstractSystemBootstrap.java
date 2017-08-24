package com.hydra.boot;


import com.hydra.invoke.JobManagerExecutor;
import com.hydra.listener.Publisher;
import com.hydra.listener.event.JobManagerStartEvent;
import com.hydra.listener.event.SystemShutdownEvent;

public abstract class AbstractSystemBootstrap extends Publisher implements SystemBootstrap{


    public void bootStart() {
        //启动作业管理器
        Thread jobManagerThread = new Thread(new JobManagerExecutor());
        jobManagerThread.setName("Hydra-JobManagerExecutor");
        jobManagerThread.start();
        //发布作业管理器启动事件
        publish(new JobManagerStartEvent(jobManagerThread));
        //TODO 启动远程服务-启动远程任务监听
    }

    public void destroy() {
        publish(new SystemShutdownEvent());
    }


}
