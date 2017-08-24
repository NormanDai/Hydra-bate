package com.hydra.invoke;


import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.hydra.core.Schedule;
import com.hydra.entries.RuntimeScheduleContextEntry;
import com.hydra.invoke.pool.JobRunnerExecutor;
import com.hydra.listener.BatchSystemEvent;
import com.hydra.listener.BatchSystemListener;
import com.hydra.listener.Publisher;
import com.hydra.listener.event.ScheduleSubmittedEvent;
import com.hydra.listener.event.SystemShutdownEvent;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class JobManagerExecutor extends Publisher implements Runnable,BatchSystemListener{// 作业执行管理器

    private JobRunnerExecutor executor = JobRunnerExecutor.getInstance();

    private AtomicBoolean isShutDown = new AtomicBoolean(false);

    public void run() {
        //启动作业执行轮询，若接受到停机事件则停止
        Map<String, Schedule> scheduleMap = RuntimeScheduleContextEntry.getInstance().getScheduleMap();
        while (!isShutDown.get() && !scheduleMap.isEmpty()){

            for(Map.Entry<String,Schedule> entry : scheduleMap.entrySet()){
                String labName = entry.getKey();
                Schedule schedule = entry.getValue();
                //若该作业满足执行条件则启动该作业
                if(schedule.whetherReady()){
                    executor.getExecutor().execute(new JobInvokeBonne(labName));
                    publish(new ScheduleSubmittedEvent(labName,schedule,new Date()));
                }

            }

        }
    }

    /**
     * 事件处理器
     * @param event
     */
    @Subscribe
    @AllowConcurrentEvents
    public void eventHandler(BatchSystemEvent event) {
        if(event instanceof SystemShutdownEvent){
            isShutDown.set(true);
        }
    }
}
