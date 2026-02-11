package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;

public class Ej4 {
    public static Integer first(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.getLast();
        }
    }

    public static void main (String[] args) {
        List<Integer> lInteger = new ArrayList<>();

        System.out.println(first(lInteger));

        lInteger.add(1);
        lInteger.add(2);
        lInteger.add(3);

        System.out.println(first(lInteger));
    }
}
