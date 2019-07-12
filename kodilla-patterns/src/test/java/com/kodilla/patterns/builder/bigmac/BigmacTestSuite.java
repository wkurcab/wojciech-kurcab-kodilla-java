package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sesame seeds")
                .burgers(3)
                .sauce("barbeque")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("chili")
                .ingredient("cheese")
                .ingredient("lettuce")
                .ingredient("peppers")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(6, howManyIngredients);
    }
}
