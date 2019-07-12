package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Paris", true);
        airport.put("Tokio", true);
        airport.put("Chicago", true);
        airport.put("London", true);
        airport.put("Atlanta", false);
        airport.put("Pekin", false);

        Boolean result = airport.get(flight.arrivalAirport);
        if (result != null) {
            return result;
        } else {
            throw new RouteNotFoundException("Error");
        }
    }
}
