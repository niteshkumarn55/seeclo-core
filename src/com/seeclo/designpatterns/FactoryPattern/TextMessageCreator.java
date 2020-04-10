package com.seeclo.designpatterns.FactoryPattern;

public class TextMessageCreator extends MessageCreator{

    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
