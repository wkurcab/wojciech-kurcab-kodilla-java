package com.kodilla.good.patterns.flights;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightRetriever flightRetriever = new FlightRetriever();
        ListOfFlights listOfFlights = flightRetriever.retrieve();

        String searchFlightFrom;
        String searchFlightTo;
        String searchFlightStopover;

        System.out.println("[1] - wyszukaj loty do ...");
        System.out.println("[2] - wyszukaj loty z ...");
        System.out.println("[3] - wyszukaj loty z miedzylądowaniem w ...");
        System.out.println();
        System.out.print("Wybierz operację: ");
        int selectionCryteria = scanner.nextInt();

        switch (selectionCryteria) {
            case 1:
                System.out.print("Wyszukaj loty do: ");
                searchFlightTo = scanner.next();

                System.out.println("\nLista lotów:\n");

                listOfFlights.getTheFlightList().stream()
                        .filter(flight -> flight.getFlightTo().equals(searchFlightTo))
                        .forEach(System.out::println);
                break;
            case 2:
                System.out.print("Wyszukaj loty z: ");
                searchFlightFrom = scanner.next();

                System.out.println("\nLista lotów:\n");

                listOfFlights.getTheFlightList().stream()
                        .filter(flight -> flight.getFlightFrom().equals(searchFlightFrom))
                        .forEach(System.out::println);
                break;
            case 3:
                System.out.print("Wyszukaj loty z międzylądowaniem w: ");
                searchFlightStopover = scanner.next();

                System.out.println("\nLista lotów:\n");

                listOfFlights.getTheFlightList().stream()
                        .filter(flight -> flight.getFlightStopover().equals(searchFlightStopover))
                        .forEach(System.out::println);
                break;
        }
    }
}