package com.hydra.invoke;


public class ShardingInvokeStrategy implements InvokeStrategy{



    public void invoke(String taskName) {

    }


    private  int[] allocateInvokeIndex(int nodeNum,int invokeNum){
        // 0 1 2 0 1 2 0 1
        int[] invokeIndexs = new int[invokeNum];
        // 0 1 2
        int[] nodeArr = new int[nodeNum];
        int j = 0;
        for (int i = 0; i < invokeNum ; i++) {
            invokeIndexs[i] = j;
            j ++ ;
           if(j >= nodeNum){
               j = 0;
           }
        }
        return invokeIndexs;
    }





}
