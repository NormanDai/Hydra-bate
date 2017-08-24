package com.hydra.invoke;


import com.hydra.annotation.wrapper.DistributedWrapper;

public interface InvokeStrategy {

    public void invoke(String taskName);

}
