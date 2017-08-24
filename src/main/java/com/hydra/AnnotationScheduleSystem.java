package com.hydra;


import com.hydra.annotation.Task;
import com.hydra.boot.AnnotationSystemBootstrap;
import com.hydra.boot.BootStrategyLoader;
import com.hydra.boot.SystemBootstrap;
import com.hydra.common.utils.PackageScanner;
import com.hydra.common.utils.ReflectUtil;
import com.hydra.common.utils.StringUtil;
import com.hydra.entries.TaskConfigurationEntry;

import java.util.List;

public class AnnotationScheduleSystem implements ScheduleSystem{

    private static AnnotationScheduleSystem instance;

    private AnnotationScheduleSystem(){}

    private String scanPath;

    private BootStrategyLoader loader;

    /**
     * 获取 AnnotationScheduleSystem 示例
     * @return
     */
    public static AnnotationScheduleSystem getInstance(){
        if (instance == null) {
            synchronized (AnnotationScheduleSystem.class) {
                if (instance == null) {
                    instance = new AnnotationScheduleSystem();
                }
            }
        }
        return instance;
    }

    /**
     * 启动系统
     */
    public void start() {
        initTaskConfig();
        loader = new BootStrategyLoader(new AnnotationSystemBootstrap());
        loader.load();
    }

    /**
     * 关闭系统
     */
    public void shutdown() {
        loader.unload();
    }

    public AnnotationScheduleSystem setProperty(String scanPath){
        this.scanPath = scanPath;
        return this;
    }


    private void initTaskConfig() {

        if (StringUtil.isNotEmpty(this.scanPath)) {// process object or class list for local system model
            List<Class> classList = ReflectUtil.getClassesByAnnotation(Task.class, PackageScanner.getClasses(this.scanPath));
            List<Object> objectList = ReflectUtil.getInstanceFromClass(classList);
            TaskConfigurationEntry configurationEntry = TaskConfigurationEntry.getInstance();
            configurationEntry.setClassList(classList);
            configurationEntry.setObjects(objectList);
        }
    }
}
