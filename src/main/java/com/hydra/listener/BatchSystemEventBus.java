package com.hydra.listener;


import com.google.common.eventbus.EventBus;

import java.util.concurrent.ConcurrentHashMap;

public class BatchSystemEventBus {

    private  static BatchSystemEventBus instance;

    private BatchSystemEventBus(){}

    private final EventBus eventBus = new EventBus() ;

    private ConcurrentHashMap<String,Class<? extends BatchSystemListener>>  listenerMap = new ConcurrentHashMap<String, Class<? extends BatchSystemListener>>();

    public static BatchSystemEventBus getInstance(){
        if (instance == null) {
            synchronized (BatchSystemEventBus.class) {
                if (instance == null) {
                    instance = new BatchSystemEventBus();
                }
            }
        }
        return instance;
    }

    /**
     * 发布事件
     * @param event
     */
    public void publish(BatchSystemEvent event){
        eventBus.post(event);
    }

    /**
     * 添加监听器
     * @param listenerClass
     */
    public void registe(Class<? extends BatchSystemListener> listenerClass){
        String listenerName = listenerClass.getSimpleName();
        if(this.listenerMap.containsKey(listenerName)){
            return;
        }

        //add listener class to the container map
        this.listenerMap.put(listenerName,listenerClass);
        try {
            eventBus.register(listenerClass.newInstance());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 注销监听器
     * @param listenerClass
     */
    public void unRegiste(Class<? extends BatchSystemListener> listenerClass){
        String listenerName = listenerClass.getSimpleName();
        if(!this.listenerMap.containsKey(listenerName)){
            return;
        }
        this.listenerMap.remove(listenerName);
        try {
            eventBus.unregister(listenerClass.newInstance());
        }catch (Exception e){
            throw new RuntimeException(e);
        }


    }




}
