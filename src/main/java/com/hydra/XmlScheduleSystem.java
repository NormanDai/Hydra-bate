package com.hydra;


import java.io.File;
import java.io.InputStream;

public class XmlScheduleSystem implements ScheduleSystem{

    private static XmlScheduleSystem instance;

    private XmlScheduleSystem(){}

    private String configPath;

    private InputStream inputStream;

    private File configFile;

    /**
     * 获取 XmlScheduleSystem 示例
     * @return
     */
    public static XmlScheduleSystem getInstance(){
        if (instance == null) {
            synchronized (XmlScheduleSystem.class) {
                if (instance == null) {
                    instance = new XmlScheduleSystem();
                }
            }
        }
        return instance;
    }

    /**
     * 启动系统
     */
    public void start() {

    }

    /**
     * 关闭系统
     */
    public void shutdown() {

    }

    public XmlScheduleSystem setProperty(String configPath){
        this.configPath = configPath;
        return this;
    }
    public XmlScheduleSystem setProperty(InputStream inputStream){
        this.inputStream = inputStream;
        return this;
    }
    public XmlScheduleSystem setProperty(File configFile){
        this.configFile = configFile;
        return this;
    }

}
