package com.hydra.listener;


public interface BatchSystemListener {

    /**
     * 事件处理器
     * @param event
     */
    void eventHandler(BatchSystemEvent event);

}
