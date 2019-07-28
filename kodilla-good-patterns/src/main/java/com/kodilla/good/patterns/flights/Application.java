package com.kodilla.good.patterns.flights;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightRetriever flightRetriever = new FlightRetriever();
        ListOfFlights listOfFlights = flightRetriever.retrieve();

        SearchFlight searchFlight = new SearchFlight();

        System.out.println("[1] - wyszukaj loty do ...");
        System.out.println("[2] - wyszukaj loty z ...");
        System.out.println("[3] - wyszukaj loty z miedzylądowaniem w ...");
        System.out.println();
        System.out.print("Wybierz operację: ");
        int selectionCryteria = scanner.nextInt();

        switch (selectionCryteria) {
            case 1:
                searchFlight.findFlightTo(listOfFlights, scanner);
                break;
            case 2:
                searchFlight.findFlightFrom(listOfFlights, scanner);
                break;
            case 3:
                searchFlight.findFlightStopover(listOfFlights, scanner);
                break;
        }
    }
}