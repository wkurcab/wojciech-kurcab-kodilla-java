package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetrievier orderRequestRetrievier = new OrderRequestRetrievier();
        OrderRequest orderRequest = orderRequestRetrievier.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ShoesOrderService(), new ShoesOrderRepository());
        productOrderService.order(orderRequest);
    }
}
