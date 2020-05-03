package com.chris.tindercyoaengine.factory;

import com.chris.tindercyoaengine.model.messages.Message;
import com.chris.tindercyoaengine.model.messages.MessageType;

public abstract class BaseMessageFactory {

    public abstract Message createMessage(MessageType messageType);
}
