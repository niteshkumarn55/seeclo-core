package com.seeclo.seecloinheritance;

public class Showroom {

    public void vehicleSpecification(Vehicle v1) {
        System.out.println(v1.toString());
    }

    public void testDrive(Vehicle v1) {
        System.out.println("Take my private road for test drive");
        v1.createVehicle().start();
        ((Sedan) v1).go();
        v1.stop();
        System.out.println("Leave my place");
    }


    public static void main(String[] agrs) {
        Showroom showroom = new Showroom();
        Sedan sedan = new Sedan();
        showroom.testDrive(sedan);
    }
}
