package com.hydra.entries;

import com.hydra.annotation.*;
import com.hydra.common.enums.*;


import java.util.Date;

/**
 * 测试类
 * @author Administrator
 *
 */
//@Task("testInvokeTask2")
public class TestInvokeTask2 {
	
	
	
	//@Executor("executorA")
	@Expression(strategy = ExpressionStrategyEnum.TIMING,measure = ExpressionMeasureEnum.MINUTE,factor = "17")
    @Distributed(strategy = DistributedStrategyEnum.PARALLEL,number = 3)
	public String executorA(EnvironmentParams context){
		String jobName = context.getJobName();
		int invokeIndex = context.getInvokeIndex();
		String str = jobName + " - " + invokeIndex + " running at " + new Date();
		System.out.println(str);
		return str;
	}
	

	@Join("testInvokeTask2@executorA")
	//@Executor("executorB")
	public String executorB(EnvironmentParams context, String values){
		String jobName = context.getJobName();
		int invokeIndex = context.getInvokeIndex();
		String str = jobName + " - " + invokeIndex + " running at " + new Date();
		System.out.println(str);
		return str;
	}

	@Join("testInvokeTask@executorC")
	//@Executor("executorC")
	public String executorC(EnvironmentParams context, String values){
		String jobName = context.getJobName();
		int invokeIndex = context.getInvokeIndex();
		String str = jobName + " - " + invokeIndex + " running at " + new Date();
		System.out.println(str);
		return str;
	}
	
}
