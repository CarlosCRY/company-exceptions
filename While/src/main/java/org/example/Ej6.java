package org.example;

import java.util.Scanner;

public class Ej6 {
    public static void main (String[] args) {
        // Un "Do While" sería mejor para esto.
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        double y = 0;

        while (x < 1) {
            System.out.println("¿Cuantos números vas a introducir?");
            x = scanner.nextInt();
            scanner.nextLine();

            if (x < 1) {
                System.out.println("No son suficientes números, introduzca otra cantidad");
            } else {
                for (int i = 0; i < x; i++) {
                    System.out.println("Introduzca número:");
                    y += scanner.nextDouble();
                }
            }
        }
        double z = y / x;
        System.out.println("La media es: " + z);
    }
}
