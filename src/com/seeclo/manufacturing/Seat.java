package com.seeclo.manufacturing;

import com.seeclo.enumImpl.SeatTypeEnum;

public class Seat {

    private SeatTypeEnum type;
   private Integer noOfSeats;
   private Integer price;

    public Seat(SeatTypeEnum type, Integer noOfSeats) {
        this.type = type;
        this.noOfSeats = noOfSeats;
        this.setPrice();
    }

    public SeatTypeEnum getType() {
        return type;
    }

    public void setType(SeatTypeEnum type) {
        this.type = type;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    private void setPrice() {
        if(this.noOfSeats==2){
            this.price = 30000;
        }else{
            this.price = 50000;
        }
    }

    public Integer getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "type=" + type +
                ", noOfSeats=" + noOfSeats +
                ", price=" + price +
                '}';
    }
}
