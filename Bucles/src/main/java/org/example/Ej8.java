package org.example;

import java.util.Scanner;

public class Ej8 {
    public static void main (String[] args) {
        System.out.println("¿Cuantos números vas a introducir?");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        double y = 0;

        for (int i = 0; i < x; i++) {
            if (i == 0 ) {
                System.out.println("Introduzca un número");
            } else {
                System.out.println("Introduzca otro número");
            }
            y = y + scanner.nextDouble();
            scanner.nextLine();
        }
        double z = y / x;
        System.out.println(z);
    }
}
