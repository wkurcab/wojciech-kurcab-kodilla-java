package com.kodilla.good.patterns.distributions;

public class DeliveryDto {
    public Supplier supplier;
    public boolean isDelivered;

    public DeliveryDto(final Supplier supplier, final boolean isDelivered) {
        this.supplier = supplier;
        this.isDelivered = isDelivered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isDelivered() {
        return isDelivered;
    }
}
