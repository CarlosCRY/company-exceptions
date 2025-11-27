package org.example;

import java.util.Scanner;

public class Ej7 {
    public static void main (String[] args) {
        System.out.println("Introduce un número:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.nextLine();
        double y = x;

        while (x != 0) {
            System.out.println("Introduce otro número:");
            x = scanner.nextDouble();
            scanner.nextLine();
            y += x;
        }
        System.out.println("La suma total es: " + y);
    }
}
