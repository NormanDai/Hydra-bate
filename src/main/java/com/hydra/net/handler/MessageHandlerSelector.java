package com.hydra.net.handler;


import com.hydra.common.enums.MessageTypeEnum;
import com.hydra.net.handler.impl.ExecuteReportMessageHandler;
import com.hydra.net.handler.impl.JobExecuteMessageHandler;

public class MessageHandlerSelector {

    public static MessageHandler select(MessageTypeEnum messageType){
        MessageHandler handler = null;
        if(MessageTypeEnum.EXE == messageType){
            return new JobExecuteMessageHandler();
        }else if(MessageTypeEnum.RPT == messageType){
            return new ExecuteReportMessageHandler();
        }else {
            throw new RuntimeException("nuknow message type!");
        }
    }
}
