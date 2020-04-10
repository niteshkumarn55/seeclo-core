package com.seeclo.designpatterns.FactoryPattern;

public class JsonMessage extends Message {

    String content = "Json message";
    @Override
    public String getContent() {
        return content;
    }
}
