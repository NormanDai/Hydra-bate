package com.hydra.boot;


import com.hydra.common.utils.P;
import com.hydra.core.AnnotationJobDescription;
import com.hydra.core.JobDetail;
import com.hydra.core.Schedule;
import com.hydra.core.graph.JobFlowGraph;
import com.hydra.entries.RuntimeJobDetailsContextEntry;
import com.hydra.entries.RuntimeJobGraphContextEntry;
import com.hydra.entries.RuntimeScheduleContextEntry;
import com.hydra.listener.event.SystemInitializeEvent;
import com.hydra.parsers.AnnotationJobDescriptionParser;
import com.hydra.parsers.JobFlowParser;
import com.hydra.parsers.ScheduleParser;

import java.util.List;
import java.util.Map;

public class AnnotationSystemBootstrap extends  AbstractSystemBootstrap{

    public void initialize() {
       // handle expression and job desc
        List<JobDetail> jobDetails = this.getJobDetails();
        P.println("AnnotationSystemBootstrap.initialize() load job details:{}",jobDetails);
        if(null != jobDetails && !jobDetails.isEmpty()){
            // obtain jobdetails and schedules to runtime context
            addJobDetailsToContext(jobDetails);
            addSchdeulesToContext(new ScheduleParser().parse(jobDetails));
            // obtain job graph and put to context entry
            addJobFlowToContextEntry(new JobFlowParser().parse());

        }
        initEventPublish();


    }

    private  List<JobDetail> getJobDetails(){
        return new AnnotationJobDescriptionParser().parse(new AnnotationJobDescription());
    }

    private void addJobDetailsToContext(List<JobDetail> details){
        RuntimeJobDetailsContextEntry detailsContextEntry = RuntimeJobDetailsContextEntry.getInstance();
        detailsContextEntry.addAll(details);
    }

    private void addSchdeulesToContext(Map<String, Schedule> scheduleMap){

        RuntimeScheduleContextEntry scheduleContextEntry = RuntimeScheduleContextEntry.getInstance();
        scheduleContextEntry.addAll(scheduleMap);
    }

    private void addJobFlowToContextEntry(Map<String, JobFlowGraph> graphMap){
        RuntimeJobGraphContextEntry.getInstance().addAll(graphMap);
    }

    /**
     * 发布系统初始化事件
     */
    private void initEventPublish(){
        SystemInitializeEvent initializeEvent = new SystemInitializeEvent();
        initializeEvent.setProperty(RuntimeJobGraphContextEntry.getInstance());
        this.publish(initializeEvent);
    }
}
