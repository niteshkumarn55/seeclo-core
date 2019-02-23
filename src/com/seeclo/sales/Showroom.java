package com.seeclo.sales;

import com.seeclo.assemble.Vehicle;

public class Showroom {

    private Vehicle vehicles;

    public Showroom(String brand) {
        this.vehicles = new Vehicle(brand);
    }

    public Vehicle getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle vehicles) {
        this.vehicles = vehicles;
    }

    public static void main(String args[]){
        Showroom showroom = new Showroom("AUDI");
        System.out.println(showroom.getVehicles());
    }
}
