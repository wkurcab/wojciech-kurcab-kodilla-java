package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetrievier {
    public OrderRequest retrive() {
        Product product = new Product("Nike Jordan Air 1 Travis", "sneakers", 1, 232.00);
//        Product product = new Product("Java 8", "it", 1, 22.00);
//        Product product = new Product("Armageddon", "strategic", 1, 43.00);
        User user = new User("Mike", "Tyson", "mike.tyson@gmail.com");

        LocalDateTime orderDate = LocalDateTime.of(2019, 6, 8, 22, 10, 38);
        int orderNumber = 101190806;

        return new OrderRequest(product, user, orderDate, orderNumber);
    }
}
