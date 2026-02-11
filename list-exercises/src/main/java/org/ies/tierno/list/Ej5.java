package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej5 {
    public static Scanner scanner = new Scanner(System.in);
    public static double sum (List<Double> numbers ) {
        double x = 0.0;
        for (Double number: numbers) {
            x += number;
        }
        return x;
    }
    public static void main (String[] args) {
        List<Double> listDoubles = new ArrayList<>();
        System.out.println("¿Cuantos números?");
        int ammount = scanner.nextInt();
        scanner.nextLine();
        double input;
        System.out.println("Introduce un número.");
        for (int i = 0; i < ammount; i++) {
            input = scanner.nextDouble();
            scanner.nextLine();
            listDoubles.add(input);
        }
        System.out.println(sum(listDoubles));
    }
}
