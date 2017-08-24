package com.hydra.core;


import com.hydra.entries.TaskConfigurationEntry;

import java.util.List;

public class AnnotationJobDescription implements JobDescription {

    /**
     * 获取描述原子
     * @return
     */
    public List<Object> getDescAtom() {
        return TaskConfigurationEntry.getInstance().getObjects();
    }
}
