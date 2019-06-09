package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class booksOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(Product product, User user, LocalDateTime orderDate, int orderNumber) {
        return false;
    }
}
