package com.duygu.waterapi;

public class WaterIntake {
    private int id;
    private int amount;
    private String date;

    public WaterIntake(int id, int amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}