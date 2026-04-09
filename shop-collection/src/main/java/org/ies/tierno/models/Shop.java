package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

@Data
@AllArgsConstructor
public class Shop {
    private String name;
    private Map<Integer, Product> products;
    private TreeSet<Customer> customers;

    public Customer findCustomer (String nif) {
        for (Customer customer: customers) {
            if (customer.getNif().equals(nif)) {
                return customer;
            }
        }
        return null;
    }

    public Order findOrder (String nif, int id) {
        if (findCustomer(nif) != null){
            findCustomer(nif).orderReturner(id);
        }
        return null;
    }

    public List<Product> listOrder (String nif, int id) {
        List<Product> rProducts = new ArrayList<>();
        if (findCustomer(nif) != null){
            for (Item item: findCustomer(nif).orderReturner(id).getItems()) {
                rProducts.add(products.get(item.getProductId()));
            }
            return rProducts;
        }
        return null;
    }

    public List<Product> taggedProducts (String tag) {
        List<Product> rProducts = new ArrayList<>();
        for (Product product: products.values()) {
            if (product.getTags().contains(tag)) {
                rProducts.add(product);
            }
        }
        if (rProducts.isEmpty()) {
            return null;
        } else {
            return rProducts;
        }
    }

    public double customerSpent (String nif) {
        return findCustomer(nif).spendeture();
    }
}
