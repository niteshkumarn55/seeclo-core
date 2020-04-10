package com.seeclo.designpatterns.Prototype;

public class SixWheeler extends Vehicle {
    private String brand = "FORD";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    protected void reset() {
        brand = "FORD";
    }

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone not supported");
    }
}
