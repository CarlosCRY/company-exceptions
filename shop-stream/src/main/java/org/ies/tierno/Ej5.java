package org.ies.tierno;

import java.util.List;

public class Ej5 {
    public static List<Integer> DRIFTINGSOULS = List.of(1, 2, 3, 4, 5);
    public static void main (String[] args) {
        DRIFTINGSOULS.stream()
                   .filter(integer -> integer + 10)
                   .toList()
                   .forEach(integer -> System.out.println(integer));

    }
}
