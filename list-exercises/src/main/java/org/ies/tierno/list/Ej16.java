package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej16 {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Integer> onlyEven (List<Integer> numbers ) {
        List<Integer> evens = new ArrayList<>();
        for (int number: numbers) {
            if ((number % 2) == 0 ) {
                evens.add(number);
            }
        }
        return evens;
    }
    public static void main (String[] args) {
        List<Integer> lInteger = new ArrayList<>();
        System.out.println("¿Cuantos números?");
        int ammount = scanner.nextInt();
        scanner.nextLine();
        int input;
        System.out.println("Introduce un número entero.");
        for (int i = 0; i < ammount; i++) {
            input = scanner.nextInt();
            scanner.nextLine();
            lInteger.add(input);
        }
        for (int evened: onlyEven(lInteger)) {
            System.out.println(evened);
        }

    }
}
