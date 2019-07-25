package com.kodilla.good.patterns.distributions;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DeliveryRequestRetriever {

    public DeliveryRequest retrieve() {
        Supplier supplier = new Supplier("Extra Food Shop", "efs@efs.com", "504-504-504");
        Product product = new Product("Ogórek szklarniowy", 12);
        LocalDateTime dateOfOrder = LocalDateTime.of(2019, 7, 25, 10, 15);

        return new DeliveryRequest(supplier, product, dateOfOrder);
    }
}
