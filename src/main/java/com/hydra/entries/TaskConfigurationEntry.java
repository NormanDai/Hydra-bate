package com.hydra.entries;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class TaskConfigurationEntry {

    private static TaskConfigurationEntry instance;

    private List<Class> classList;

    private List<Object> objects;

    private TaskConfigurationEntry(){}

    public static TaskConfigurationEntry getInstance(){
        if (instance == null) {
            synchronized (TaskConfigurationEntry.class) {
                if (instance == null) {
                    instance = new TaskConfigurationEntry();
                }
            }
        }
        return instance;
    }


}
