package com.seeclo.designpatterns.Prototype;

public abstract class Vehicle implements Cloneable{

    private String vehicleType;

    public Vehicle() {
        vehicleType = "CAR";
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        Vehicle vehicle = (Vehicle) super.clone();
        vehicle.intialize();
        return vehicle;
    }

    private void intialize() {
        this.vehicleType = "CAR";
        reset();
    }
    protected  abstract void reset();


}
