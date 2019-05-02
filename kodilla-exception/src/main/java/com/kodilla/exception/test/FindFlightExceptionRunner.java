package com.kodilla.exception.test;

public class FindFlightExceptionRunner {
    public static void main(String[] srgs) {
        Flight flight = new Flight("London", "Dubaj");
        FindFlight findFlight = new FindFlight();

        try {
            if (findFlight.findFlight(flight)) {
                System.out.println("Airport \"" + flight.arrivalAirport + "\" currently supports all flights.");
            } else {
                System.out.println("Airport \"" + flight.arrivalAirport + "\" currently not available.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Attention!!! Airport \"" + flight.arrivalAirport + "\" does not exist in the map!");
        } finally {
            System.out.println("\nThe End :)");
        }
    }
}
