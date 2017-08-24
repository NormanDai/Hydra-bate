package com.hydra.entries;


import com.hydra.core.Schedule;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class RuntimeScheduleContextEntry {

    private static RuntimeScheduleContextEntry instance = new RuntimeScheduleContextEntry();

    private  Map<String,Schedule> scheduleMap = new ConcurrentHashMap<String, Schedule>();

    private RuntimeScheduleContextEntry(){}

    public static RuntimeScheduleContextEntry getInstance(){
        if (instance == null) {
            synchronized (RuntimeScheduleContextEntry.class) {
                if (instance == null) {
                    instance = new RuntimeScheduleContextEntry();
                }
            }
        }
        return instance;
    }

    public Map<String,Schedule> getScheduleMap(){
        return this.scheduleMap;
    }

    public void putSchduleToMap(String labName, Schedule schedule){
        scheduleMap.put(labName,schedule);
    }

    public void addAll(Map<String, Schedule> scheduleMap){
        for (Map.Entry<String,Schedule> entry : scheduleMap.entrySet()){
            putSchduleToMap(entry.getKey(),entry.getValue());
        }
    }


}
