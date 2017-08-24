package com.hydra.net.handler;


import com.hydra.net.entries.Message;
import com.hydra.net.entries.impl.ProtocolEntry;

public interface MessageHandler <T extends Message<ProtocolEntry>>{
     void process(T t);
}
