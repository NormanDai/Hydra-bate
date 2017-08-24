package com.hydra.annotation;


import com.hydra.common.enums.ExpressionMeasureEnum;
import com.hydra.common.enums.ExpressionStrategyEnum;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Expression {

	/**  执行模式*/
	ExpressionStrategyEnum strategy() default ExpressionStrategyEnum.STANDARD;
	/**  执行单位*/
	ExpressionMeasureEnum measure() default ExpressionMeasureEnum.STANDARD;
	/**  执行因子*/
	String factor() default "";


}
