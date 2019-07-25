package com.kodilla.good.patterns.rentals;

import com.kodilla.good.patterns.challenges.User;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {
        User user = new User("John", "Wekl", "john.wekl@johnwekl.com");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        return new RentRequest(user, rentFrom, rentTo);
    }
}
