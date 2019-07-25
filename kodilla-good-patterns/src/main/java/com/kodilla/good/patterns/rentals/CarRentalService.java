package com.kodilla.good.patterns.rentals;

import com.kodilla.good.patterns.challenges.User;
import java.time.LocalDateTime;

public class CarRentalService implements RentalService {

    public boolean rent(final User user, final LocalDateTime carRentalForm, final LocalDateTime carRentalTo) {
        System.out.println("Renting Car for: " + user.getName() + " " + user.getSurname() + " from: " + carRentalForm.toString() +
                " to: " + carRentalTo.toString());
    return true;
    }
}
