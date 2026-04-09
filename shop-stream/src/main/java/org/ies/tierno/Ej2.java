package org.ies.tierno;

import java.util.List;

public class Ej2 {
    public static List<Integer> MUERTEATODO = List.of(1, 2, 3);
    public static void main (String[] args) {
        MUERTEATODO.stream()
                   .map(integer -> integer + 10)
                   .toList()
                   .forEach(integer -> System.out.println(integer));

    }
}
