package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public Set<String> getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getCountryName)
                .collect(Collectors.toSet());
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return  continents.remove(continent);
    }

    public Set<Continent> getContinents() {
        return new HashSet<>(continents);
    }

    @Override
    public String toString() {
        return "World{" +
                "continents=" + continents +
                '}';
    }
}
