package com.hydra.core;

import com.hydra.annotation.wrapper.WrapperBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.reflect.Method;

@Getter
@Setter
@ToString
public class JobDetail {

    private String labName;

    private Object instance;

    private Method invokeMethod;

    private WrapperBean wrapper;

}
