package com.hydra.core.graph;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class JobFlowNode {

    private String labName;

    private List<JobFlowNode> nextNodes = new ArrayList<JobFlowNode>();


    public void addAfter(JobFlowNode node){
        nextNodes.add(node);
    }

    public JobFlowNode getIndex(int index){
        return nextNodes.get(index);
    }

}
