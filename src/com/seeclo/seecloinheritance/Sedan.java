package com.seeclo.seecloinheritance;

public class Sedan extends FourWheeler{
    public Sedan() {

    }

    @Override
    public void start(){
        System.out.println("Sedan's "+getEngine()+" got started...");
    }
    @Override
    public void stop(){
        System.out.println("Sedan's "+getEngine()+" got stopped");
    }

}
