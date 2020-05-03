package com.chris.tindercyoaengine.model.messages;

public abstract class Message {
    MessageType messageType;
    String message;
    public abstract void buildMessage();

    public String getMessage(){
        return message;
    }
}
