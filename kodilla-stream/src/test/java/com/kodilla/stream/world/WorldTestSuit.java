package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuit {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        //Country
        Country poland = new Country("Poland", 38000000L);
        Country german = new Country("German", 80000000L);
        Country france = new Country("France", 68000000L);
        Country spain = new Country("Spain", 48000000L);
        Country czech = new Country("Czech", 11000000L);
        Country italy = new Country("Italy", 54000000L);
        Country china = new Country("China", 1300000000L);
        Country india = new Country("India", 1150000000L);
        Country japan = new Country("Japan", 120000000L);
        Country usa = new Country("USA", 170000000L);
        Country canada = new Country("Canada", 39000000L);
        //Continent
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(german);
        europe.addCountry(france);
        europe.addCountry(spain);
        europe.addCountry(czech);
        europe.addCountry(italy);
        Continent asia = new Continent("Asia");
        europe.addCountry(china);
        europe.addCountry(india);
        europe.addCountry(japan);
        Continent northAmerica = new Continent("North America");
        europe.addCountry(usa);
        europe.addCountry(canada);
        //World
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal totalPeople = world.getContinents().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeople = new BigDecimal("3078000000");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}
