package org.example;

import java.util.Scanner;

public class Compare {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número.");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce con el que comparar.");
        int y = scanner.nextInt();
        scanner.nextLine();
        // La siguiente línea crea una claúsula if
        if (x > y) {
            // Todas las sentencias que pongamos aquí se ejecutarán sólo si x es mayor que y
            System.out.println("Es mayor.");
        } else if (x < y) {
            System.out.println("Es menor.");
        } else {
            System.out.println("Es igual.");
        }
    }
}
