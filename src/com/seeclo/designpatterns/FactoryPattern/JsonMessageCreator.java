package com.seeclo.designpatterns.FactoryPattern;

public class JsonMessageCreator extends MessageCreator {
    @Override
    protected Message createMessage() {
        return new JsonMessage();
    }
}
