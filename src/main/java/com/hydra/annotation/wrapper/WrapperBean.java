package com.hydra.annotation.wrapper;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.reflect.Method;

@Setter
@Getter
@ToString
public class WrapperBean {

    private String labName;

    private TaskWrapper taskWrapper;

    private JoinWrapper joinWrapper;

    private ExpressionWrapper expressionWrapper;

    private ExecutorWrapper executorWrapper;

    private DistributedWrapper distributedWrapper;
}
