package com.seeclo.designpatterns.FactoryPattern;

public abstract class MessageCreator {

    public Message getMessage(){
        return createMessage();
    }

    protected abstract Message createMessage();
}
