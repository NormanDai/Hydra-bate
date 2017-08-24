package com.hydra.invoke;


import com.hydra.annotation.wrapper.DistributedWrapper;
import com.hydra.common.enums.DistributedStrategyEnum;
import com.hydra.common.utils.StringUtil;
import com.hydra.entries.RuntimeJobDetailsContextEntry;

public class ParallelJobInvoker extends  ParallelInvokeStrategy{// 并行作业本地执行类，用于手动启动一个本地作业

    public ParallelJobInvoker(String jobName){
        if(StringUtil.isNotEmpty(jobName)){
            DistributedWrapper distributedWrapper = RuntimeJobDetailsContextEntry.getInstance().getDetailMap().get(jobName).getWrapper().getDistributedWrapper();
            DistributedStrategyEnum strategyEnum = distributedWrapper.getStrategy();
            if(strategyEnum ==  DistributedStrategyEnum.PARALLEL){
                super.invoke(jobName);
            }
        }else {
            throw new RuntimeException("Job name can't been empty for invoke !");
        }
    }
}
