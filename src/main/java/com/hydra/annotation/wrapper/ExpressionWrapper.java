package com.hydra.annotation.wrapper;


import com.hydra.common.enums.ExpressionMeasureEnum;
import com.hydra.common.enums.ExpressionStrategyEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ExpressionWrapper {


    private ExpressionStrategyEnum strategy;

    private ExpressionMeasureEnum measure;

    private String factor;

}
