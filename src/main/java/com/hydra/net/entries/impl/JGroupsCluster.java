package com.hydra.net.entries.impl;


import com.hydra.net.entries.Cluster;

import java.util.concurrent.atomic.AtomicBoolean;

public class JGroupsCluster implements Cluster<JGroupsAddress>{

    private static JGroupsCluster instance;

    private JGroupsCluster(){}

    private AtomicBoolean isMaster = new AtomicBoolean(false);

    private JGroupsAddress[] members;

    public static JGroupsCluster getInstance(){
        if (instance == null) {
            synchronized (JGroupsCluster.class) {
                if (instance == null) {
                    instance = new JGroupsCluster();
                }
            }
        }
        return instance;
    }


    public boolean isMaster() {
        return isMaster.get();
    }

    public JGroupsAddress[] getMembers() {
        return new JGroupsAddress[0];
    }

    public void setMaster(boolean isMaster) {
        this.isMaster.set(isMaster);
    }

    public void resetMembers(JGroupsAddress[] members) {

       if(null != members && members.length > 0){
           this.members = members;
       }

    }
}
