package com.hydra.net.handler.impl.jgroups;


import com.hydra.net.entries.impl.JGroupsAddress;
import com.hydra.net.handler.OutBoradHandler;
import com.hydra.net.entries.impl.RemoteJobInvokeMessage;
import com.hydra.net.jgroups.JGroupsRemoteAdapter;

public class JGroupsOutboradHandler extends OutBoradHandler<RemoteJobInvokeMessage> {

    @Override
    protected void sendMessage() {
        JGroupsAddress jGroupsAddress = (JGroupsAddress)this.address.getAddress();
        JGroupsRemoteAdapter.getInstance().send(jGroupsAddress.getAddress(),this.message);
    }
}
