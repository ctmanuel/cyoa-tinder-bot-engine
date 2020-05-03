package com.chris.tindercyoaengine.factory;

import com.chris.tindercyoaengine.model.messages.*;

public class MessageFactory extends BaseMessageFactory{

    @Override
    public Message createMessage(MessageType messageType) {
        Message message;
        switch (messageType) {
            case INTRODUCTION:
                message = new IntroMessage();
                break;
            case STORY_ENDING:
                message = new StoryEndMessage();
                break;
            case STATISTICS:
                message = new StatisticsMessage();
                break;
            case STORY_INTRODUCTION:
                message = new StoryIntroMessage();
                break;
            default:
                message = new GenericMessage();
                break;
        }
        message.buildMessage();
        return message;
    }
}
