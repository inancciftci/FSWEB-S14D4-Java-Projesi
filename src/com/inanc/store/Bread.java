package com.inanc.store;

public class Bread extends ProductForSale{
    private String breadType;
    private String color;

    public Bread(String type, double price, String description, String breadType, String color) {
        super(type, price, description);
        this.breadType = breadType;
        this.color = color;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "type='" + breadType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
