package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;

public class Ej8 {
    public static Double min(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return null;
        } else {
            double x = numbers.getFirst();
            for (Double number: numbers){
                if (x > number) {
                    x = number;
                }
            }
            return x;
        }
    }

    public static void main (String[] args) {
        List<Double> listDoubles = new ArrayList<>();

        System.out.println(min(listDoubles));

        listDoubles.add(1.2);
        listDoubles.add(-5.6);
        listDoubles.add(3.4);

        System.out.println(min(listDoubles));
    }
}
