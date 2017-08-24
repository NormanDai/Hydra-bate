package com.hydra.net.entries;


public interface Address<T> {

    /**
     * 设置地址
     * @param t
     */
    void setAddress(T t);

    /**
     * 获取地址
     * @return
     */
    T getAddress();

    /**
     * 转换地址
     * @param address
     * @return
     */
    T addressConverte(Address address);

}
