package com.hydra.annotation;


import com.hydra.common.enums.DistributedStrategyEnum;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Distributed {
	/**
	 * 任务分发策略
	 * @return
	 */
	DistributedStrategyEnum strategy() default DistributedStrategyEnum.PARALLEL;

	/**
	 * 分发数量
	 * @return
	 */
	int number() default 1;

}
