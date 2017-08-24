package com.hydra.net;


import com.hydra.common.utils.P;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class JobQueue {

    private static JobQueue instance;

    private BlockingQueue<String> jobQueue = new ArrayBlockingQueue<String>(1024);

    private JobQueue(){}

    public static JobQueue getInstance(){
        if (instance == null) {
            synchronized (JobQueue.class) {
                if (instance == null) {
                    instance = new JobQueue();
                }
            }
        }
        return instance;
    }

    /**
     * 获取
     * @return
     */
    public String take(){
         try {
             return jobQueue.take();
         }catch (InterruptedException e){
             throw new RuntimeException(e);
         }
    }

    /**
     * 放置
     * @param ctn
     */
    public void put(String ctn){
        try {
            this.jobQueue.put(ctn);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }


}
