package org.example;

import java.util.Scanner;

public class Ej4 {
    public static void main (String[] args) {
        System.out.println("Introduzca un número. Introduzca un número negativo para acabar la operación");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.nextLine();

        int counter = 0;

        while (x > 0) {
            counter++;
            System.out.println("Introduzca otro número");
            x = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("Ha introducido un total de: " + counter);
    }
}
