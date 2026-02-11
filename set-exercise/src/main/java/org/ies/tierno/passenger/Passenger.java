package org.ies.tierno.passenger;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Passenger implements Comparable <Passenger> {
    private String nif;
    private String name;
    private String surname;
    private int seat;

    @Override
    public int compareTo(Passenger other) {
        int compare = name.compareTo(other.name);
        if (compare == 0) {
            compare = surname.compareTo(other.surname);
        }
        return compare;
    }
}
