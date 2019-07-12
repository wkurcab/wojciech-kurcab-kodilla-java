package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public Product product;
    public User user;
    public boolean isOrdered;

    public OrderDto(final Product product, final User user, final boolean isOrdered) {
        this.product = product;
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
