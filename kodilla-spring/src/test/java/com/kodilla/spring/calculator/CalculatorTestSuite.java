package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations() {
        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(7.2, 6.0);
        double resultSub = calculator.sub(7.2, 6.0);
        double resultMul = calculator.mul(7.2, 6.0);
        double resultDiv = calculator.div(7.2, 6.0);
        //Then
        Assert.assertEquals(13.2, resultAdd, 0.001);
        Assert.assertEquals(1.2, resultSub, 0.001);
        Assert.assertEquals(43.2, resultMul, 0.001);
        Assert.assertEquals(1.2, resultDiv, 0.001);
    }
}
