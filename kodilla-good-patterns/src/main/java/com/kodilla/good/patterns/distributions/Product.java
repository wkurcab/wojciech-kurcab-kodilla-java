package com.kodilla.good.patterns.distributions;

public class Product {
    private String productName;
    private int qty;

    public Product(String productName, int qty) {
        this.productName = productName;
        this.qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public int getQty() {
        return qty;
    }
}
