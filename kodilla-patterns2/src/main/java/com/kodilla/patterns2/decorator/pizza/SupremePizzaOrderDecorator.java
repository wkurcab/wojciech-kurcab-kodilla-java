package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SupremePizzaOrderDecorator extends AbstractPizzaOrderDecorator {
    public SupremePizzaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(15.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " SUPREME \nbeef, pepperoni, onion, green paprik, mushrooms, mozzarella.";
    }
}
