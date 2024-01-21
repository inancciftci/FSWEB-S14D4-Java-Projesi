package com.inanc.store;

public class Chocolate extends ProductForSale {
    private boolean isBitter;
    private double calories;

    public Chocolate(String type, double price, String description, boolean isBitter, double calories) {
        super(type, price, description);
        this.isBitter = isBitter;
        this.calories = calories;
    }


    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "isBitter=" + isBitter +
                ", calories=" + calories +
                '}';
    }
}
