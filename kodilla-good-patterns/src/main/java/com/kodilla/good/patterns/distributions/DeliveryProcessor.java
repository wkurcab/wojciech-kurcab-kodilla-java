package com.kodilla.good.patterns.distributions;

public class DeliveryProcessor {
    private InformationService informationService;
    private DeliveryService deliveryService;

    public DeliveryProcessor( final InformationService informationService, final DeliveryService deliveryService) {
        this.informationService = informationService;
        this.deliveryService = deliveryService;
    }

    public DeliveryDto process(final DeliveryRequest deliveryRequest) {
        boolean isDelivered = deliveryService.isDelivery(deliveryRequest.getSupplier(), deliveryRequest.getProduct(),
                deliveryRequest.getDateOfOrder());
        if (isDelivered) {
            informationService.inform(deliveryRequest.getSupplier());
            return new DeliveryDto(deliveryRequest.getSupplier(), true);
        } else {
            return new DeliveryDto(deliveryRequest.getSupplier(), false);
        }
    }
}
