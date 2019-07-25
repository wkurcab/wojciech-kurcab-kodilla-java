package com.kodilla.good.patterns.rentals;

import com.kodilla.good.patterns.challenges.User;
import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {

    public void createCarRental(User user, LocalDateTime rentFrom, LocalDateTime rentTo) {
    }

    @Override
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {
        return false;
    }
}
