package com.hydra.common.enums;

import lombok.Getter;

@Getter
public enum MessageKeyEnum {

    ASK("ASK", "询问"),
    ACK("ACK","应答"),
    REJ("REJ","拒绝"),
    RPT("RPT","报告"),
    NAK("NAK","无应答");

    private  String code;
    private  String value;

    MessageKeyEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static MessageKeyEnum explain(String code) {

        for (MessageKeyEnum entityNameEnum : MessageKeyEnum.values()) {
            if (entityNameEnum.code.equals(code)) {
                return entityNameEnum;
            }
        }
        return null;
    }

}
