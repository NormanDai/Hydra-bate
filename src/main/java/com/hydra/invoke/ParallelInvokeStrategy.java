package com.hydra.invoke;


import com.hydra.annotation.wrapper.DistributedWrapper;
import com.hydra.common.utils.StringUtil;
import com.hydra.core.JobDetail;
import com.hydra.entries.EnvironmentParams;
import com.hydra.entries.RuntimeJobDetailsContextEntry;
import com.hydra.invoke.pool.JobRunnerExecutor;

public class ParallelInvokeStrategy implements InvokeStrategy{


    public void invoke(final String jobName) {

        if(StringUtil.isNotEmpty(jobName)){
            JobDetail jobDetail = RuntimeJobDetailsContextEntry.getInstance().getDetailMap().get(jobName);
            if(null != jobDetail){
                int jobNumber = jobDetail.getWrapper().getDistributedWrapper().getNumber();
                for (int i = 0; i < jobNumber; i++) {
                    JobRunnerExecutor.getInstance().getExecutor().execute(
                            new JobInvokeArrow(jobName,paramPrepare(jobDetail,i))
                    );
                }
            }
        }
    }

    private EnvironmentParams paramPrepare(final JobDetail jobDetail,int lessNum){
        EnvironmentParams params = new EnvironmentParams();
        params.setInvokeIndex(lessNum);
        params.setJobName(jobDetail.getLabName());
        params.setTotalInvoke(jobDetail.getWrapper().getDistributedWrapper().getNumber());
        return params;
    }

}
