package com.hydra.invoke;


import com.hydra.listener.event.SystemShutdownEvent;
import com.hydra.listener.listener.AbstractEventListener;

public abstract class ThreadRunningMonitor extends AbstractEventListener<SystemShutdownEvent> implements Runnable{

    private Thread thread;

    private boolean isShutdown = false;

    public ThreadRunningMonitor(Thread thread){
        this.thread = thread;
    }

    public void run() {
        if(null != this.thread){
           while (!isShutdown){
               if(!thread.isAlive()){
                   reBootHandler();
                   break;
               }
           }
        }
    }

    @Override
    public void eventProcess(SystemShutdownEvent systemShutdownEvent) {
        if(null != systemShutdownEvent){
            isShutdown = true;
        }
    }

    abstract void reBootHandler();
}
