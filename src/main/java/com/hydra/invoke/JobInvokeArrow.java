package com.hydra.invoke;


import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.hydra.core.JobDetail;
import com.hydra.core.graph.JobFlowGraph;
import com.hydra.core.graph.JobFlowNode;
import com.hydra.entries.EnvironmentParams;
import com.hydra.entries.RuntimeJobDetailsContextEntry;
import com.hydra.entries.RuntimeJobGraphContextEntry;
import com.hydra.invoke.pool.JobRunnerExecutor;
import org.apache.commons.lang.exception.ExceptionUtils;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;


public class JobInvokeArrow implements Runnable{

    private final String jobName;

    private final EnvironmentParams params;

    private ListeningExecutorService threadPoolExecutor = JobRunnerExecutor.getInstance().getThreadPoolExecutor();

    public JobInvokeArrow(final String jobName,final EnvironmentParams params){
        this.jobName = jobName;
        this.params = params;
    }

    public void run() {

        RuntimeJobGraphContextEntry graphContextEntry = RuntimeJobGraphContextEntry.getInstance();
        JobFlowGraph jobFlowGraph = graphContextEntry.getGraphMap().get(jobName);
        if(null != jobFlowGraph){
            invokeSubTaskByClass(jobFlowGraph.getInitExecutorNode(),null,params);
        }

    }

    /**
     * 递归执行所有关联任务
     * @param node
     * @param param
     * @param environmentParams
     */
    private void invokeSubTaskByClass(JobFlowNode node, Object param, EnvironmentParams environmentParams){
        if(null != node){
            String labName = node.getLabName();
            /**  get invoke class and invoke method*/

            Map<String, JobDetail> detailMap = RuntimeJobDetailsContextEntry.getInstance().getDetailMap();
            JobDetail jobDetail = detailMap.get(labName);
            Object instance = jobDetail.getInstance();
            Method invokeMethod = jobDetail.getInvokeMethod();

            /** set callback task wrapper*/
            CallableTaskWrapper callableTask = new CallableTaskWrapper(labName,invokeMethod,null,instance, param);
            EnvironmentParams environmentPar = getNewEnvironmentParams(environmentParams);
            environmentPar.setJobName(labName);
            callableTask.setEnvironmentParams(environmentPar);

            ListenableFuture<Object> listenableFuture = threadPoolExecutor.submit(callableTask);
            /** add callback to this invoke*/
            JobFutureCallback jobFutureCallback = new JobFutureCallback();
            CountDownLatch waitLatch = new CountDownLatch(1);
            jobFutureCallback.setDownLatch(waitLatch);
            Futures.addCallback(listenableFuture, jobFutureCallback,threadPoolExecutor);

            try {
                waitLatch.await();
            }catch (Exception exception){
                ExceptionUtils.printRootCauseStackTrace(exception);
            }

            Object result = jobFutureCallback.getResult();
            Throwable throwable = jobFutureCallback.getThrowable();
            if(null != throwable){
                ExceptionUtils.printRootCauseStackTrace(throwable);
            }
            List<JobFlowNode> nextNodes = node.getNextNodes();
            if(null != nextNodes && !nextNodes.isEmpty()){
                for (JobFlowNode nextNode:nextNodes){
                    invokeSubTaskByClass(nextNode,result,environmentPar);
                }
            }

        }

    }

    private EnvironmentParams getNewEnvironmentParams(final EnvironmentParams environmentParams){
        EnvironmentParams environmentPar = new EnvironmentParams();
        environmentPar.setInvokeIndex(environmentParams.getInvokeIndex());
        environmentPar.setInvokeParams(environmentParams.getInvokeParams());
        environmentPar.setJobName(environmentParams.getJobName());
        environmentPar.setTotalInvoke(environmentParams.getTotalInvoke());
        return environmentPar;
    }



}
