package com.seeclo.seecloinheritance;

public class Plane extends Vehicle {


    @Override
    public void start(){
        System.out.println("Plane got Started");
    }

    @Override
    public void stop(){
        System.out.println("Plane got stopped");
    }
    public void takeOff(){
        System.out.println("Plane is taking off");
    }

    public void landing(){
        System.out.println("Plane is landing in the runway");

    }
}
