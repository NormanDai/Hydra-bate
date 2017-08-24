package com.hydra.boot;


public interface SystemBootstrap {//系统启动引导

    /**
     * 初始化
     */
    void initialize();

    /**
     * 启动
     */
    void bootStart();

    /**
     * 销毁
     */
    void destroy();
}
