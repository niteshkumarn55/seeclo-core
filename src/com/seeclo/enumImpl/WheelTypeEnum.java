package com.seeclo.enumImpl;

public enum WheelTypeEnum {

    ALLOY("ALLOY"),
    RIM("RIM");

    private String wheelType;

    private WheelTypeEnum(String tyep){
        this.wheelType = tyep;
    }

    public String value(){
        return this.wheelType;
    }
}
