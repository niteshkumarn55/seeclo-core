package com.seeclo.designpatterns.FactoryPattern;

public class Client {

    public static void main(String[] agrs){
        MessageCreator messageCreator = new JsonMessageCreator();
        System.out.println(messageCreator.getMessage());

        MessageCreator messageCreator2 = new TextMessageCreator();
        System.out.println(messageCreator2.getMessage());
    }
}
