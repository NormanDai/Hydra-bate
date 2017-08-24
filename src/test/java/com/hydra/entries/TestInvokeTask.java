package com.hydra.entries;


import com.hydra.annotation.*;
import com.hydra.common.enums.*;


import java.lang.reflect.Method;
import java.util.Date;

/**
 * 测试类
 * @author Administrator
 *
 */
@Task("testInvokeTask")
public class TestInvokeTask {



	@Executor("executorA")
	@Expression(strategy = ExpressionStrategyEnum.TIMING, measure = ExpressionMeasureEnum.MINUTE,factor = "15")
	@Distributed(strategy = DistributedStrategyEnum.SHARDING,number = 2)
	public String executorA(EnvironmentParams context){
		String jobName = context.getJobName();
		int invokeIndex = context.getInvokeIndex();
		String str = jobName + " - " + invokeIndex + " running at " + new Date();
		System.out.println(str);
		return str;
	}


	@Join("testInvokeTask@executorA")
	@Executor("executorB")
	public String executorB(EnvironmentParams context, String values){

		String jobName = context.getJobName();
		int invokeIndex = context.getInvokeIndex();
		String str = jobName + " - " + invokeIndex + " running at " + new Date() + " param is:[" + values + " ]" ;
		System.out.println(str);
		return jobName;
	}

	@Join("testInvokeTask@executorB")
	@Executor("executorC")
	public String executorC(EnvironmentParams context, String values){
		String jobName = context.getJobName();
		int invokeIndex = context.getInvokeIndex();
		String str = jobName + " - " + invokeIndex + " running at " + new Date() + " param is:[" + values + " ]" ;
		System.out.println(str);
		return jobName;
	}



}
