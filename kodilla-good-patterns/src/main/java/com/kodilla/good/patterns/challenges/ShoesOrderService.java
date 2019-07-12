package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ShoesOrderService implements OrderService {
    public boolean order(final Product product, final User user, final LocalDateTime shoesOrderDate, final int shoesOrderNumber) {
        System.out.println("Shoes: " + product.getProductCategory() + " \"" + product.getProductName()
                + "\" - qty. " + product.getProductQty() + " - price: " + product.getProductPrice() + " $,\nfor: " + user.getName() + " " + user.getSurname()
                + ", order date: " + shoesOrderDate.toString() + ", order number: " + shoesOrderNumber);
        return true;
    }
}
