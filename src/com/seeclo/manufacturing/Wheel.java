package com.seeclo.manufacturing;

import com.seeclo.enumImpl.WheelTypeEnum;

public class Wheel {

    private WheelTypeEnum type;
    private Integer height;
    private Integer width;
    private Integer price;

    public Wheel(WheelTypeEnum type, Integer height, Integer width) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.setPrice();
    }

    public WheelTypeEnum getType() {
        return type;
    }

    public void setType(WheelTypeEnum type) {
        this.type = type;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    private void setPrice() {
        if(this.type.value().equals(WheelTypeEnum.ALLOY.value())){
            this.price = 40000;
        }else if(this.type.value().equals(WheelTypeEnum.RIM.value())){
            this.price = 10000;
        }
    }

    public Integer getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Wheel{" +
                "type=" + type +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                '}';
    }
}
