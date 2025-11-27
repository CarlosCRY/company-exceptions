package org.example;

import java.util.Scanner;

public class Ej2 {
    public static void main (String[] args) {
        System.out.println("Dime un número natural");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Dime un número natural menor");
        double y = scanner.nextDouble();
        scanner.nextLine();

        while (x <= y) {
            System.out.println("¡No! ¡No lo es! Prueba otra vez");
            y = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println(x + ", " + y + " ¡Correcto! ¿Ves que como no es tan difícil?");
    }
}
