package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private Product product;
    private User user;
    private LocalDateTime orderDate;
    private int orderNumber;

    public OrderRequest(final Product product, final User user, final LocalDateTime orderDate, final int orderNumber) {
        this.product = product;
        this.user = user;
        this.orderDate = orderDate;
        this.orderNumber = orderNumber;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
