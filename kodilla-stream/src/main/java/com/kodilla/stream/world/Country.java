package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final int peopleQuantity;

    public Country(final String countryName, final int peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleCQuantity() {
        BigDecimal peopleCQuantity = new BigDecimal(peopleQuantity);
        return peopleCQuantity;
    }

    public String getCountryName() {
        return countryName;
    }


}

