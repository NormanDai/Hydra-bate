package com.hydra.entries;


import com.hydra.core.JobDetail;
import com.hydra.core.Schedule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class RuntimeJobDetailsContextEntry {

    private static RuntimeJobDetailsContextEntry instance = new RuntimeJobDetailsContextEntry();

    private  Map<String,JobDetail> detailMap = new ConcurrentHashMap<String, JobDetail>();

    private RuntimeJobDetailsContextEntry(){}

    public static RuntimeJobDetailsContextEntry getInstance(){
        if (instance == null) {
            synchronized (RuntimeJobDetailsContextEntry.class) {
                if (instance == null) {
                    instance = new RuntimeJobDetailsContextEntry();
                }
            }
        }
        return instance;
    }

    public Map<String,JobDetail> getDetailMap(){
        return this.detailMap;
    }

    public void putDetailMap(String labName, JobDetail jobDetail){
        detailMap.put(labName,jobDetail);
    }

    public void addAll(List<JobDetail> details){
        for (JobDetail detail : details){
            putDetailMap(detail.getLabName(),detail);
        }
    }


}
