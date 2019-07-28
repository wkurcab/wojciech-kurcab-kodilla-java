package com.kodilla.good.patterns.flights;

import java.util.Scanner;

public class SearchFlight {
    String searchFlightFrom;
    String searchFlightTo;
    String searchFlightStopover;

    public void findFlightTo(ListOfFlights listOfFlights, Scanner scanner) {
        System.out.print("Wyszukaj loty do: ");
        searchFlightTo = scanner.next();

        System.out.println("\nLista lotów:\n");

        listOfFlights.getTheFlightList().stream()
                .filter(flight -> flight.getFlightTo().equals(searchFlightTo))
                .forEach(System.out::println);
    }

    public void findFlightFrom(ListOfFlights listOfFlights, Scanner scanner) {
        System.out.print("Wyszukaj loty z: ");
        searchFlightFrom = scanner.next();

        System.out.println("\nLista lotów:\n");

        listOfFlights.getTheFlightList().stream()
                .filter(flight -> flight.getFlightFrom().equals(searchFlightFrom))
                .forEach(System.out::println);
    }

    public void findFlightStopover(ListOfFlights listOfFlights, Scanner scanner) {
        System.out.print("Wyszukaj loty z międzylądowaniem w: ");
        searchFlightStopover = scanner.next();

        System.out.println("\nLista lotów:\n");

        listOfFlights.getTheFlightList().stream()
                .filter(flight -> flight.getFlightStopover().equals(searchFlightStopover))
                .forEach(System.out::println);
    }
}
