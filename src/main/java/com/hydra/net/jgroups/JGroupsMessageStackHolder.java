package com.hydra.net.jgroups;


import com.hydra.net.handler.InBoradHandler;
import com.hydra.net.MessageStackHolder;
import com.hydra.net.handler.OutBoradHandler;
import com.hydra.net.handler.impl.jgroups.JGroupsInboradHandler;
import com.hydra.net.handler.impl.jgroups.JGroupsOutboradHandler;

public class JGroupsMessageStackHolder extends MessageStackHolder {

    @Override
    protected InBoradHandler getInboradHandler() {
        return new JGroupsInboradHandler();
    }

    @Override
    protected OutBoradHandler getOutboradHandler() {
        return new JGroupsOutboradHandler();
    }
}
