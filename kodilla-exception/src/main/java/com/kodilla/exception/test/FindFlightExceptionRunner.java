package com.kodilla.exception.test;

public class FindFlightExceptionRunner {
    public static void main(String[] srgs) {
        Flight flight = new Flight("London", "Atlanta");
        FindFlight findFlight = new FindFlight();

        try {
            findFlight.findFlight(flight);
            System.out.println("Airport \"" + findFlight.findFlight(flight) + "\" currently supports all flights.");
        } catch (RouteNotFoundException e) {
            System.out.println("Airport \"" + flight.arrivalAirport + "\" currently not available.");
        } catch (Exception e) {
            System.out.println("Attention!!! Airport \"" + flight.arrivalAirport + "\" does not exist in the map!");
        } finally {
            System.out.println("\nThe End :)");
        }
    }
}
