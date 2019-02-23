package com.seeclo.manufacturing;

import com.seeclo.enumImpl.EngineTypeEnum;

public class Engine {

    private Integer stroke;
    private EngineTypeEnum type;
    private Integer price;

    public Engine(Integer stroke, EngineTypeEnum type) {
        this.stroke = stroke;
        this.type = type;
        this.setPrice();
    }

    public Integer getStroke() {
        return stroke;
    }

    public void setStroke(Integer stroke) {
        this.stroke = stroke;
    }

    public EngineTypeEnum getType() {
        return type;
    }

    public void setType(EngineTypeEnum type) {
        this.type = type;
    }

    private void setPrice() {
        if(this.stroke == 2){
            this.price = 20000;
        }else{
            this.price = 40000;
        }
    }

    public Integer getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "stroke='" + stroke + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
