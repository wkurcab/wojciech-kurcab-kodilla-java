package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private String flightTo;
    private String flightFrom;
    private String flightStopover;

    public Flight(String flightTo, String flightFrom, String flightStopover) {
        this.flightTo = flightTo;
        this.flightFrom = flightFrom;
        this.flightStopover = flightStopover;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightStopover() {
        return flightStopover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightTo, flight.flightTo) &&
                Objects.equals(flightFrom, flight.flightFrom) &&
                Objects.equals(flightStopover, flight.flightStopover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightTo, flightFrom, flightStopover);
    }

    @Override
    public String toString() {
        return "Lot {" +
                " z: " + flightFrom + " do: " + flightTo + ", z międzylądowaniem w: " + flightStopover + "}";
    }
}
