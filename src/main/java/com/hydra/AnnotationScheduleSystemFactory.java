package com.hydra;


import com.hydra.invoke.JobManagerExecutor;
import com.hydra.listener.BatchSystemEventBus;
import com.hydra.listener.listener.SystemInitializeListener;

public class AnnotationScheduleSystemFactory implements  ScheduleSystemFactory{

    private String scanPath;


    AnnotationScheduleSystemFactory(String scanPath){
        this.scanPath = scanPath;
    }

    /**
     * 获取系统启动实例
     * @return
     */
    public ScheduleSystem getSystem() {
        addSystemListener();
        return AnnotationScheduleSystem.getInstance().setProperty( this.scanPath);
    }

    private void addSystemListener(){
        //添加监听器
        BatchSystemEventBus eventBus = BatchSystemEventBus.getInstance();
        eventBus.registe(SystemInitializeListener.class);
        eventBus.registe(JobManagerExecutor.class);
    }

}
