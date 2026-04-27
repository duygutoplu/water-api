package com.duygu.waterapi;

public class WaterIntake {

    private Integer id;
    private Integer amount;
    private String date;

    public WaterIntake() {
    }

    public WaterIntake(Integer id, Integer amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }
}