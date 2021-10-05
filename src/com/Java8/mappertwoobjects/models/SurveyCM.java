package com.Java8.mappertwoobjects.models;


public class SurveyCM {

    private String survayId;
    private String usage;
    private String type;
    private String name;
    private boolean enable;
    private boolean overridden;
    private String category;

    public String getId() {
        return survayId;
    }

    public void setId(String survayId) {
        this.survayId = survayId;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isOverridden() {
        return overridden;
    }

    public void setOverridden(boolean overridden) {
        this.overridden = overridden;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SurveyCM{" +
                "survayId='" + survayId + '\'' +
                ", usage='" + usage + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                ", overridden=" + overridden +
                ", category='" + category + '\'' +
                '}';
    }
}
