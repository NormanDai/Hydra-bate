package com.hydra.core.graph;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class JobFlowGraph extends JobFlowNode {

    private JobFlowNode initExecutorNode;

    public JobFlowNode getHeader(){
        return initExecutorNode;
    }

}
