package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void  main (String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // kolejny test
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(5, 5);
        int resultSubtract = calculator.subtract(5, 5);

        System.out.println("Addition test");
        if (resultAdd == 10) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Subtraction test");
        if (resultSubtract == 0) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}