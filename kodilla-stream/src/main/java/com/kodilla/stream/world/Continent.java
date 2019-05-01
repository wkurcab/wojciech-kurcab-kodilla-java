package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    List<Country> country = new ArrayList<>();

    public Continent(List<Country> country) {
        this.country = country;
    }

    public List<Country> getCountry() {
        return country;
    }
}
