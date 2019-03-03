package com.seeclo.seecloinheritance;

public class TwoWheeler extends Vehicle {

    @Override
    public void start(){
        System.out.println("Twowheeler car got started...");
    }
    @Override
    public void stop(){
        System.out.println("Twowheeler car got stopped");
    }


    public void go(){
        System.out.println("Two wheeler is driving on the road");
    }

}
