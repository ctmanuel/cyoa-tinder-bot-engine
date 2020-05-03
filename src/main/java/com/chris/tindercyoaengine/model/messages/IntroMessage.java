package com.chris.tindercyoaengine.model.messages;

public class IntroMessage extends Message {

    public enum IntroType {
        Intro1,
        Intro2,
        Intro3,
    }

    @Override
    public void buildMessage(){
        this.message = "message";
    }

}
