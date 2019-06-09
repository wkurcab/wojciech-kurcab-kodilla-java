package com.kodilla.good.patterns.challenges;

public class Product {
    private String productName;
    private String productCategory;
    private int productQty;
    private double productPrice;

    public Product(final String productName, final String productCategory, final int productQty, final double productPrice) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductQty() {
        return productQty;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
