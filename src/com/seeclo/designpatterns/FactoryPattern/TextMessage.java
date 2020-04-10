package com.seeclo.designpatterns.FactoryPattern;

public class TextMessage extends Message {

    String content = "Text content message";
    @Override
    public String getContent() {
        return content;
    }
}
