package com.hydra.common.enums;

import lombok.Getter;

@Getter
public enum MessageTypeEnum implements java.io.Serializable{

    EXE("EXE", "任务执行"),
    REXE("REXE","重新执行"),
    RPT("RPT","结果报告");

    private  String code;
    private  String value;

    MessageTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public static MessageTypeEnum explain(String code) {

        for (MessageTypeEnum entityNameEnum : MessageTypeEnum.values()) {
            if (entityNameEnum.code.equals(code)) {
                return entityNameEnum;
            }
        }
        return null;
    }

}
