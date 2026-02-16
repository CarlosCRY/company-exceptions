package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
    private String iban;
    private String nif;
    private double balance;

    public void addBalance (double added) {
        balance += added;
    }

    public boolean removeBalance (double removed) {
        if (balance >= removed) {
            balance -= removed;
            return true;
        } else {
            return false;
        }
    }
}
