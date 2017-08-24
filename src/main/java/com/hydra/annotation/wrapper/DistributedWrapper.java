package com.hydra.annotation.wrapper;


import com.hydra.common.enums.DistributedStrategyEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DistributedWrapper {

    private DistributedStrategyEnum strategy;

    private int number;

}
