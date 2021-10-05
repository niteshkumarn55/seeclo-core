package com.Java8.mappertwoobjects.models;

public class SettingsCM {

    private String settingId;
    private boolean enable;
    private boolean overridden;
    private String category;

    public SettingsCM(String settingId, boolean enable, boolean overridden, String category) {
        this.settingId = settingId;
        this.enable = enable;
        this.overridden = overridden;
        this.category = category;
    }

    public String getSettingId() {
        return settingId;
    }

    public void setSettingId(String settingId) {
        this.settingId = settingId;
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
}
