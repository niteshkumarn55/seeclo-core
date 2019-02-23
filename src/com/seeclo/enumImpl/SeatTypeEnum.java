package com.seeclo.enumImpl;

public enum SeatTypeEnum {

    LEATHER("LEATHER"),
    NORMAL("NORMAL");

    private String seatType;

    private SeatTypeEnum(String tyep){
        this.seatType = tyep;
    }

    public String value(){
        return this.seatType;
    }
}
