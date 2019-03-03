package com.seeclo.seecloinheritance;

public class Vehicle {

    private String brand = "maruthi";
    private Integer price = 100000;
    private Float fuel = 10f;
    private String engine;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Float getFuel() {
        return fuel;
    }

    public void setFuel(Float fuel) {
        this.fuel = fuel;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", fuel=" + fuel +
                ", engine='" + engine + '\'' +
                '}';
    }

    public void start(){
        System.out.println("Vehicle started...");
    }
    public void stop(){
        System.out.println("Vehicle stopped");
    }
}
