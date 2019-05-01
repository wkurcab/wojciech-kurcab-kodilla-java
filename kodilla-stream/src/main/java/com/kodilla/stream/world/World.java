package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    List<Continent> continent = new ArrayList<>();

//    public Set<BigDecimal> getPeopleQuantity() {
//        return continent.stream()
//                .flatMap(user -> user.country.stream())
//                .map(Country::getCountryName)
//                .collect(Collectors.toSet());
//    }
}
