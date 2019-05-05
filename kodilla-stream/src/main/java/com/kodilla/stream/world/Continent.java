package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final Set<Country> countries = new HashSet<>();
    private final String continentName;

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public boolean removeCountry(Country country) {
        return  countries.remove(country);
    }

    public Set<Country> getCountries() {
        return new HashSet<>(countries);
    }

    public String getContinentName() {
        return continentName;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                "countries=" + countries + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }
}
