package org.ies.tierno.passenger;

import java.util.Comparator;

public class CompareBySeatSurnName implements Comparator<Passenger>{

    @Override
    public int compare (Passenger passenger1, Passenger passenger2) {
        int compare = Integer.compare(passenger1.getSeat(), passenger2.getSeat());
        if (compare == 0) {
            compare = passenger1.getSurname().compareTo(passenger2.getSurname());
            if (compare == 0) {
                compare = passenger1.getName().compareTo(passenger2.getName());
            }
        }
        return compare;
    }

}
