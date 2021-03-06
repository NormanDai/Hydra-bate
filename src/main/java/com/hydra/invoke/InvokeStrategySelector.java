package com.hydra.invoke;


import com.hydra.common.enums.DistributedStrategyEnum;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InvokeStrategySelector {

    public static InvokeStrategy selectStrategy(DistributedStrategyEnum strategy){

        InvokeStrategy invokeStrategy = new ParallelInvokeStrategy();
        if(strategy == DistributedStrategyEnum.SHARDING){
            invokeStrategy = new ShardingInvokeStrategy();
        }
        return invokeStrategy;
    }

}
