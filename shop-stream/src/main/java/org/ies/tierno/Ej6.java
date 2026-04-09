package org.ies.tierno;

import org.ies.tierno.models.Order;

import java.util.List;

public class Ej6 {
    public static List<Double> returnPrices(List<Order> orders) {
        return orders.stream()
                     .map(order -> order.getPrice())
                     .toList();
    }
}
