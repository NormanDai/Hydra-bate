package com.hydra.net.entries;


import lombok.Getter;

import java.util.List;

public interface Cluster<T extends Address> {

    /**
     * 当前节点是否为master
     * @return
     */
    boolean isMaster();

    /**
     * 获取所有集群成员的地址
     * @return
     */
    T[] getMembers();

    /**
     * 设置master标识
     * @param isMaster
     */
    void setMaster(boolean isMaster);

    /**
     * 重置成员列表
     * @param members
     */
    void resetMembers(T[] members);
}
