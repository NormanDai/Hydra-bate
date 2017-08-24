package com.hydra.entries;


import com.hydra.core.Schedule;
import com.hydra.core.graph.JobFlowGraph;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class RuntimeJobGraphContextEntry {

    private static RuntimeJobGraphContextEntry instance = new RuntimeJobGraphContextEntry();

    private  Map<String,JobFlowGraph> graphMap = new ConcurrentHashMap<String, JobFlowGraph>();

    private RuntimeJobGraphContextEntry(){}
//GraphMap
    public static RuntimeJobGraphContextEntry getInstance(){
        if (instance == null) {
            synchronized (RuntimeJobGraphContextEntry.class) {
                if (instance == null) {
                    instance = new RuntimeJobGraphContextEntry();
                }
            }
        }
        return instance;
    }

    public Map<String,JobFlowGraph> getGraphMap(){
        return this.graphMap;
    }

    public void putGraphToMap(String labName, JobFlowGraph graph){
        graphMap.put(labName,graph);
    }

    public void addAll(Map<String, JobFlowGraph> flowGraphMap){
        for (Map.Entry<String,JobFlowGraph> entry : flowGraphMap.entrySet()){
            putGraphToMap(entry.getKey(),entry.getValue());
        }
    }

    @Override
    public String toString() {
        return graphMap.toString();
    }
}
