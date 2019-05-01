package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuit {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countries = new ArrayList<>();
//        countries.add(new Country("Poland"));
//        countries.add(new Country("Germany"));
//        countries.add(new Country("France"));
//        countries.add(new Country("Spain"));
//        countries.add(new Country("Czech"));
//        countries.add(new Country("Italy"));

        //When
//        BigDecimal totalPeople = countries.stream()
//                .map(World::getPeopleQuantity)
//                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeople = new BigDecimal("40734074070");
//        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
