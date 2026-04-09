package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String name;
    private double price;
    private Set<String> tags;
}
