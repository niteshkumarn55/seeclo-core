package com.seeclo.designpatterns.Prototype;

public class FourWheeler extends Vehicle {

    private String brand = "bMW";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    protected void reset() {
        brand = "BMW";
    }
}
