package com.hydra.entries;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ConfigurationTaskEntry {

    private static ConfigurationTaskEntry instance;

    private List<Class<?>> classList;

    private List<Object> objects;

    private ConfigurationTaskEntry(){}

    public static ConfigurationTaskEntry getInstance(){
        if (instance == null) {
            synchronized (ConfigurationTaskEntry.class) {
                if (instance == null) {
                    instance = new ConfigurationTaskEntry();
                }
            }
        }
        return instance;
    }


}
