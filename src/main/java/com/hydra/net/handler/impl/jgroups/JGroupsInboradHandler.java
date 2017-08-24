package com.hydra.net.handler.impl.jgroups;


import com.hydra.common.enums.MessageTypeEnum;
import com.hydra.net.handler.InBoradHandler;
import com.hydra.net.entries.impl.RemoteJobInvokeMessage;
import com.hydra.net.handler.MessageHandler;
import com.hydra.net.handler.MessageHandlerSelector;

public class JGroupsInboradHandler extends InBoradHandler<RemoteJobInvokeMessage> {

    @Override
    protected void onReceive() {
        MessageHandler handler = MessageHandlerSelector.select(this.message.getType());
        handler.process(this.message);
    }
}
