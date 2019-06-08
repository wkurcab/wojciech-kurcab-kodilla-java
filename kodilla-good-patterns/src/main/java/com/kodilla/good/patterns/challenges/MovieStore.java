package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore {
    public static Map<String, List<String>> getMovies() {

        List<String> ironManTranslation = new ArrayList<>();
        ironManTranslation.add("Żelazny Człowiek");
        ironManTranslation.add("Iron Man");

        List<String> avengersTranslation = new ArrayList<>();
        avengersTranslation.add("Mściciele");
        avengersTranslation.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitleWithTranslations = new HashMap<>();
        booksTitleWithTranslations.put("IM", ironManTranslation);
        booksTitleWithTranslations.put("AV", avengersTranslation);
        booksTitleWithTranslations.put("FL", flashTranslations);

        return booksTitleWithTranslations;
    }
}
