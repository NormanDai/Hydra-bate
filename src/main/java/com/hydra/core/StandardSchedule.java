package com.hydra.core;

import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@ToString
public class StandardSchedule implements  Schedule{

    private long nextInvokeTime = 0;

    private boolean whetherReady = false;
    public long nextInvokeTimeByLong() {
        return nextInvokeTime;
    }

    public boolean whetherReady() {

        if(!whetherReady){
            Date nowDate = new Date();
            long timeLong = nowDate.getTime();
            if(nextInvokeTime >= timeLong){
                return true;
            }
            return false;
        }
        return whetherReady;
    }


}
