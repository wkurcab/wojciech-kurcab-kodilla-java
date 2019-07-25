package com.kodilla.good.patterns.distributions;

import java.time.LocalDateTime;

public class DeliveryRequest {
    private Supplier supplier;
    private Product product;
    private LocalDateTime dateOfOrder;

    public DeliveryRequest(Supplier supplier, Product product, LocalDateTime dateOfOrder) {
        this.supplier = supplier;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
}
