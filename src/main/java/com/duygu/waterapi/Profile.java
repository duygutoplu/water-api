package com.duygu.waterapi;

public class Profile {

    private Integer age;
    private Double heightCm;
    private Double weightKg;
    private String preferredWaterUnit;

    public Profile() {
    }

    public Profile(Integer age, Double heightCm, Double weightKg, String preferredWaterUnit) {
        this.age = age;
        this.heightCm = heightCm;
        this.weightKg = weightKg;
        this.preferredWaterUnit = preferredWaterUnit;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeightCm() {
        return heightCm;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public String getPreferredWaterUnit() {
        return preferredWaterUnit;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHeightCm(Double heightCm) {
        this.heightCm = heightCm;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public void setPreferredWaterUnit(String preferredWaterUnit) {
        this.preferredWaterUnit = preferredWaterUnit;
    }
}
