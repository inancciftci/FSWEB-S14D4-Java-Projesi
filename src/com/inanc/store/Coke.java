package com.inanc.store;

public class Coke extends ProductForSale{
    private boolean hasSugar;
    private double calories;

    public Coke(String type, double price, String description, boolean hasSugar, double calories) {
        super(type, price, description);
        this.hasSugar = hasSugar;
        this.calories = calories;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "hasSugar=" + hasSugar +
                ", calories=" + calories +
                '}';
    }
}
