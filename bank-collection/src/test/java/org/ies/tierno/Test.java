package org.ies.tierno;

import org.ies.tierno.models.Account;
import org.ies.tierno.models.Bank;
import org.ies.tierno.models.Customer;

import java.util.List;
import java.util.Map;

public class Test {
    private Bank TEST() {
        List<Customer> customerList = List.of(
            new Customer("0001D", "Alberich", "Nidavellir", 10001),
            new Customer("2012X", "Haze", "Edgeson", 42067),
            new Customer("6548D", "Brent", "Halligan", 12345),
            new Customer("2168L", "Benjamin Spooner", "Briggs", 12345)
        );

        Map<String, Account> accountMap = Map.of(
            "516846515ND", new Account("516846515ND", "0001D", 9999999.99d),
            "638446848MK", new Account("638446848MK", "2012X", 120420.23d),
            "658486524LD", new Account("658486524LD", "6548D", 0.00d),
            "565218545SW", new Account("565218545SW", "6548D", 8000000.00d),
            "464846469CA", new Account("464846469CA", "2168L", 936845.25d)
        );

        return new Bank ("Tester & Bullocks", customerList, accountMap);
    }
    public static void main (String[] args) {
        
    }
}
