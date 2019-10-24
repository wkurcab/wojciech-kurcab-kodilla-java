package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OnionOrderDecorator extends AbstractPizzaOrderDecorator {
    public OnionOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", onion";
    }
}
