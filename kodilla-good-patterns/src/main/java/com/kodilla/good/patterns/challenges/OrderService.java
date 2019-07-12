package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(Product product, User user, LocalDateTime orderDate, int orderNumber);
}
