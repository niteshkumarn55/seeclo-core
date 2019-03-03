package com.seeclo.seecloinheritance;

public class Showroom {

    public void vehicleSpecification(Vehicle v1){
        System.out.println(v1.toString());
    }

    public void testDrive(Vehicle v1){
        System.out.println("Take my private road for test drive");
        v1.start();
        if(v1 instanceof Sedan) {
            ((Sedan) v1).go();
        }else if(v1 instanceof FighterJet) {
            ((FighterJet) v1).takeOff();
            ((FighterJet) v1).go();
            ((FighterJet) v1).landing();
        }
        v1.stop();
        System.out.println("Leave my place");
    }


    public static void main(String[] agrs){
        Showroom showroom = new Showroom();
        FighterJet fighterJet = new FighterJet();
        showroom.testDrive(fighterJet);
    }
}

