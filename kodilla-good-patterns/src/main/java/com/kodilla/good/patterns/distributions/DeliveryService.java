package com.kodilla.good.patterns.distributions;

import java.time.LocalDateTime;

public interface DeliveryService {
    boolean isDelivery(Supplier supplier, Product product, LocalDateTime dateOfOrder);
}
