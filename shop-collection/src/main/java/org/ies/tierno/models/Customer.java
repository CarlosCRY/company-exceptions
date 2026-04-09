package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Customer implements Comparable<Customer>{
    private String nif;
    private String name;
    private String surname;
    private List<Order> orders;

    public int compareTo (Customer other) {
        int compare = surname.compareTo(other.surname);
        if (compare == 0) {
            compare = name.compareTo(other.name);
            if (compare == 0) {
                compare = nif.compareTo(other.nif);
            }
        }
        return compare;
    }

    public Order orderReturner (int id) {
        for (Order order: orders) {
            if (order.getOrderId() == id) {
                return order;
            }
        }
        return null;
    }

    public double spendeture () {
        double tSpent = 0;
        for (Order order: orders) {
            tSpent += order.getPrice();
        }
        return tSpent;
    }
}
