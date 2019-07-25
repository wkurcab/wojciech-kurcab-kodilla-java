package com.kodilla.good.patterns.rentals;

import com.kodilla.good.patterns.challenges.User;
import java.time.LocalDateTime;

public interface RentalRepository {
    boolean createRental(User user, LocalDateTime from, LocalDateTime to);
}
