package com.hydra.invoke;


import com.hydra.annotation.wrapper.DistributedWrapper;
import com.hydra.annotation.wrapper.WrapperBean;
import com.hydra.common.utils.StringUtil;
import com.hydra.core.JobDetail;
import com.hydra.entries.RuntimeJobDetailsContextEntry;

public class JobInvokeBonne implements Runnable{

    private String jobName;

    public JobInvokeBonne(String jobName){this.jobName = jobName;}

    private RuntimeJobDetailsContextEntry detailsContextEntry = RuntimeJobDetailsContextEntry.getInstance();

    public void run() {
        if(StringUtil.isNotEmpty(this.jobName)){
            // 获取 jobDetail
            JobDetail jobDetail = detailsContextEntry.getDetailMap().get(this.jobName);
            if(null != jobDetail){
                WrapperBean wrapper = jobDetail.getWrapper();
                DistributedWrapper distributedWrapper = wrapper.getDistributedWrapper();
                InvokeStrategySelector.selectStrategy(distributedWrapper.getStrategy()).invoke(this.jobName);
            }
        }
    }
}
