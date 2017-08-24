package com.hydra.parsers;


import com.hydra.annotation.wrapper.WrapperBean;
import com.hydra.common.utils.P;
import com.hydra.core.JobDetail;
import com.hydra.core.Schedule;
import com.hydra.core.graph.JobFlowGraph;
import com.hydra.core.graph.JobFlowNode;
import com.hydra.entries.RuntimeJobDetailsContextEntry;
import com.hydra.entries.RuntimeScheduleContextEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class JobFlowParser {



    public Map<String,JobFlowGraph> parse(){
        /**  获取上下文容器*/
        Map<String,JobFlowGraph> flowGraphMap = new ConcurrentHashMap<String, JobFlowGraph>();
        Map<String, Schedule> scheduleMap = RuntimeScheduleContextEntry.getInstance().getScheduleMap();
        for(Map.Entry<String,Schedule> entry : scheduleMap.entrySet()){

            JobFlowGraph graph = new JobFlowGraph();
            graph.setLabName(entry.getKey());
            JobFlowNode headerNode = new JobFlowNode();
            headerNode.setLabName(entry.getKey());
            graph.setInitExecutorNode(headerNode);
            setNextNodes(headerNode);
            flowGraphMap.put(entry.getKey(),graph);
        }
        P.println("JobFlowParser.parse() load flowGraphMap:{}",flowGraphMap);
        return flowGraphMap;
    }

    private List<WrapperBean> obtainWrapper(Map<String,JobDetail> detailMap){
        List<WrapperBean> wrapperBeanList = new ArrayList<WrapperBean>();
        for(Map.Entry<String,JobDetail> entry : detailMap.entrySet()){
            wrapperBeanList.add(entry.getValue().getWrapper());
        }
        return wrapperBeanList;
    }

    private  void setNextNodes(JobFlowNode node){
        if(null != node){
            Map<String, JobDetail> detailMap = RuntimeJobDetailsContextEntry.getInstance().getDetailMap();
            for(Map.Entry<String,JobDetail> entry : detailMap.entrySet()){
                WrapperBean wpBean = entry.getValue().getWrapper();
                String labName = entry.getKey();
                if(null != wpBean.getJoinWrapper() && wpBean.getJoinWrapper().getName().equals(node.getLabName())){
                    JobFlowNode childNode = new JobFlowNode();
                    childNode.setLabName(labName);
                    node.getNextNodes().add(childNode);
                    setNextNodes(childNode);
                }

            }
        }
    }


}
