package com.kodilla.good.patterns.flights;

import java.util.List;

public class ListOfFlights {
    private List<Flight> theFlightList;

    public ListOfFlights(List<Flight> theFlightList) {
        this.theFlightList = theFlightList;
    }

    public List<Flight> getTheFlightList() {
        return theFlightList;
    }

    @Override
    public String toString() {
        return "ListOfFlights{" +
                "theFlightList=" + theFlightList +
                '}';
    }
}
