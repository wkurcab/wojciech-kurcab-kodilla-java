package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class GamesOrderService implements OrderService {
    public boolean order(final Product product, final User user, final LocalDateTime gamesOrderDate, final int gamesOrderNumber) {
        System.out.println("Games: " + product.getProductCategory() + " \"" + product.getProductName()
                + "\" - qty. " + product.getProductQty() + " - price: " + product.getProductPrice() + " $,\nfor: " + user.getName() + " " + user.getSurname()
                + ", order date: " + gamesOrderDate.toString() + ", order number: " + gamesOrderNumber);
        return true;
    }
}
