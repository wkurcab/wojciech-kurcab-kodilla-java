package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightRetriever {

    public ListOfFlights retrieve() {
        Flight flight = new Flight("Warsaw", "Cracow", "");
        Flight flight1 = new Flight("Gdansk", "Cracow", "Warsaw");
        Flight flight2 = new Flight("Cracow", "Warsaw", "");
        Flight flight3 = new Flight("Cracow", "Gdansk", "Warsaw");
        Flight flight4 = new Flight("Warsaw", "Wroclaw", "");
        Flight flight5 = new Flight("Wroclaw", "Cracow", "");
        Flight flight6 = new Flight("Cracow", "Wroclaw", "");
        Flight flight7 = new Flight("Poznan", "Cracow", "");
        Flight flight8 = new Flight("Cracow", "Poznan", "");
        Flight flight9 = new Flight("Warsaw", "Poznan", "");
        Flight flight10 = new Flight("Poznan", "Warsaw", "");
        Flight flight11 = new Flight("Poznan", "Wroclaw", "");
        Flight flight12 = new Flight("Wroclaw", "Poznan", "");

        List<Flight> theFlights = new ArrayList<>();
        theFlights.add(flight);
        theFlights.add(flight1);
        theFlights.add(flight2);
        theFlights.add(flight3);
        theFlights.add(flight4);
        theFlights.add(flight5);
        theFlights.add(flight6);
        theFlights.add(flight7);
        theFlights.add(flight8);
        theFlights.add(flight9);
        theFlights.add(flight10);
        theFlights.add(flight11);
        theFlights.add(flight12);

        return new ListOfFlights(theFlights);
    }
}
