package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Pizza (tomato sausage, cheese)", description);
    }
    @Test
    public void testPizzaOrderWithHamOnionMushroomsBaconExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new OnionOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new BaconOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);
    }
    @Test
    public void testPizzaOrderWithHamOnionMushroomsBaconExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamOrderDecorator(theOrder);
        theOrder = new OnionOrderDecorator(theOrder);
        theOrder = new MushroomsOrderDecorator(theOrder);
        theOrder = new BaconOrderDecorator(theOrder);
        theOrder = new ExtraCheeseOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Pizza (tomato sausage, cheese), ham, onion, mushrooms, bacon with extra cheese", description);
    }
    @Test
    public void testSupremePizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SupremePizzaOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(30), theCost);
    }
    @Test
    public void testSupremePizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SupremePizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Pizza (tomato sausage, cheese) SUPREME \nbeef, pepperoni, onion, green paprik, mushrooms, mozzarella.", description);
    }
}
