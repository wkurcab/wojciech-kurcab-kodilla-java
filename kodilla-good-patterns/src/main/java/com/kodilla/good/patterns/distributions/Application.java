package com.kodilla.good.patterns.distributions;

public class Application {
    public static void main(String[] args) {
        DeliveryRequestRetriever deliveryRequestRetriever = new DeliveryRequestRetriever();
        DeliveryRequest deliveryRequest = deliveryRequestRetriever.retrieve();

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(new MailService(),
                new ExtraFoodShopDeliveryService());
        deliveryProcessor.process(deliveryRequest);
    }
}
