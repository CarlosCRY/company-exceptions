package org.ies.tierno;

import org.ies.tierno.models.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class Ej6Tests {

    @Test
    public void returnPricesTest () {
        List<Order> orders = List.of(
                new Order(001, LocalDate.now(), 12.25, List.of()),

                new Order(002, LocalDate.now(), 21.50, List.of()),

                new Order(003, LocalDate.now(), 4.60, List.of())
        );

        List<Double> prices = Ej6.returnPrices(orders);

        Assertions.assertEquals(
                List.of(12.25, 21.50, 4.60),
                prices
        );

    }
}

