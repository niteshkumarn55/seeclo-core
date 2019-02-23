package com.seeclo.assemble;

import com.seeclo.enumImpl.EngineTypeEnum;
import com.seeclo.enumImpl.SeatTypeEnum;
import com.seeclo.enumImpl.WheelTypeEnum;
import com.seeclo.manufacturing.Engine;
import com.seeclo.manufacturing.Seat;
import com.seeclo.manufacturing.Wheel;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class Vehicle {

    private String brand;
    private Engine engine;
    private Wheel wheels;
    private Seat seats;
    private Integer price;

    public Vehicle(String brand) {
        this.brand = brand;
        if(brand.equals("BMW")){
            this.engine = new Engine(4, EngineTypeEnum.DIESEL);
            this.wheels = new Wheel(WheelTypeEnum.ALLOY,100, 10);
            this.seats = new Seat(SeatTypeEnum.LEATHER, 4);
            this.setPrice();
        }else if(brand.equals("AUDI")){
            this.engine = new Engine(2, EngineTypeEnum.PATROL);
            this.wheels = new Wheel(WheelTypeEnum.RIM,100, 10);
            this.seats = new Seat(SeatTypeEnum.NORMAL, 4);
            this.setPrice();
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public Seat getSeats() {
        return seats;
    }

    public void setSeats(Seat seats) {
        this.seats = seats;
    }

    private void setPrice() {
        Integer enginePrice = this.engine.getPrice();
        Integer seatPrice = this.seats.getPrice();
        Integer wheelPrice = this.wheels.getPrice();
        Integer vehiclePrice = enginePrice + seatPrice + wheelPrice + 10000;
        this.price = vehiclePrice;
    }

    public Integer getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", price=" + price +
                '}';
    }
}
