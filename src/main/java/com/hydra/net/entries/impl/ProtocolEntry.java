package com.hydra.net.entries.impl;


import com.hydra.common.enums.MessageTypeEnum;
import com.hydra.entries.EnvironmentParams;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProtocolEntry implements  java.io.Serializable{

    private MessageTypeEnum messageType;

    private String messageKey;

    private String messageCode;

    private String messageContext;

    private String success;

    private String errorContext;

    private EnvironmentParams params;

}
