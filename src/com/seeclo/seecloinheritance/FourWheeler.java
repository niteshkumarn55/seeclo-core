package com.seeclo.seecloinheritance;

public class FourWheeler extends Vehicle {

    private Long wheels = 4L;

    private String engine = "car engine";

    public FourWheeler() {
    }

    public FourWheeler(String engine) {
        this.engine = engine;
    }

    @Override
    public void start(){
        System.out.println("Fourwheeler car got started...");
    }
    @Override
    public void stop(){
        System.out.println("Fourwheeler car got stopped");
    }


    public void go(){
        System.out.println("Four wheeler is driving on the road");
    }

    @Override
    public String getEngine() {
        return engine;
    }
}
