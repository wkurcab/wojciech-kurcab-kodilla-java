package com.kodilla.good.patterns.distributions;

import java.time.LocalDateTime;

public class GlutenFreeShopDeliveryService implements DeliveryService {
    @Override
    public boolean isDelivery(Supplier supplier, Product product, LocalDateTime dateOfOrder) {
        System.out.println("Delivery from " + supplier.getName() + ", e-mail: " + supplier.getEmail() + ", phone: " +
                supplier.getPhone() + "\nproduct: " + product.getProductName() + " - qty.: " + product.getQty() +
                "\norder date: " + dateOfOrder.toString() + ".");
        return true;
    }
}
