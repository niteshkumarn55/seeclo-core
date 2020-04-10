package com.seeclo.designpatterns.Prototype;

public class Client {

    public static void main(String[] agrs){
        Vehicle fourWheeler=new FourWheeler();
        ((FourWheeler) fourWheeler).setBrand("AUDI");
        System.out.println(fourWheeler+"and the brand is "+((FourWheeler) fourWheeler).getBrand());
        try {
            Vehicle car = fourWheeler.clone();
            System.out.println(car+"and the brand is "+((FourWheeler) car).getBrand());
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
    }
}
