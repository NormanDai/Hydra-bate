package com.hydra.net.entries;


import com.hydra.common.enums.MessageTypeEnum;

public interface Message <T> {

    /**
     * 添加消息实体
     * @param t
     */
    void put(T t);

    /**
     * 获取消息实体
     * @return
     */
    T get();

    /**
     * 获取消息类型
     * @return
     */
    MessageTypeEnum getType();
}
