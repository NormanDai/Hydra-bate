package com.hydra.listener.event;


import com.hydra.core.Schedule;
import com.hydra.listener.BatchSystemEvent;
import lombok.Getter;

import java.util.Date;

@Getter
public class ScheduleSubmittedEvent implements BatchSystemEvent{

    private Schedule schedule;

    private String jobName;

    private Date subDate;

    public  ScheduleSubmittedEvent(String jobName,Schedule schedule,Date sbmDate){
        this.schedule = schedule;
        this.jobName = jobName;
        this.subDate = sbmDate;
    }
}
