package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BooksOrderService implements OrderService {
    public boolean order(final Product product, final User user, final LocalDateTime booksOrderDate, final int booksOrderNumber) {
        System.out.println("Books: " + product.getProductCategory() + " \"" + product.getProductName()
                + "\" - qty. " + product.getProductQty() + " - price: " + product.getProductPrice() + " $,\nfor: " + user.getName() + " " + user.getSurname()
                + ", order date: " + booksOrderDate.toString() + ", order number: " + booksOrderNumber);
        return true;
    }
}
