package com.inanc.store;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[4];
        products[0] = new Chocolate("Chocolate", 15.99, "Chocolate Bar", true, 159.76);
        products[1] = new Bread("Bakery", 3.99, "Loaf Bread", "loaf", "yellow");
        products[2] = new Coke("Drinks", 1.85, "Coca Cola Zero", true, 100);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            if(product != null) {
                product.showDetails();
            }
        }
    }
}