package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto order(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getOrderDate(), orderRequest.getOrderNumber());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getProduct(), orderRequest.getUser(), orderRequest.getOrderDate(), orderRequest.getOrderNumber());
            return new OrderDto(orderRequest.getProduct(), orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getProduct(), orderRequest.getUser(), false);
        }
    }
}
