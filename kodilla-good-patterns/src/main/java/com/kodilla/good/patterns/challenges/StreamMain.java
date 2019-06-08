package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String theResultStringOfMovies = movieStore.getMovies().entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining(" ! ", "", ""));
        System.out.println(theResultStringOfMovies);
    }
}
