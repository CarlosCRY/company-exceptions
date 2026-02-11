package org.ies.tierno.flight;

import java.util.Comparator;

public class CompareByComNum implements Comparator<Flight>{

    @Override
    public int compare (Flight flight1, Flight flight2) {
        int compare = flight1.getCompany().compareTo(flight2.getCompany());
        if (compare == 0) {
            compare = Integer.compare(flight1.getNumber(), flight2.getNumber());
        }
        return compare;
    }

}
