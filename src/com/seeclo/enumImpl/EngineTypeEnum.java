package com.seeclo.enumImpl;

public enum EngineTypeEnum {

    DIESEL("DIESEL"),
    PATROL("PATROL"),
    ELECTRIC("ELECTRIC");

    private String engineType;
    private EngineTypeEnum(String engineTye){
        this.engineType = engineTye;
    }

    public String value(){
        return this.engineType;
    }


}
