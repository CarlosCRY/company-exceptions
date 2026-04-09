package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
    private int orderId;
    private Date date;
    private double price;
    private List<Item> items;
}
