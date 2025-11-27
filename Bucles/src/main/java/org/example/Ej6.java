package org.example;

import java.util.Scanner;

public class Ej6 {
    public static void main (String[] args) {
        System.out.println("¿Cuantos números vas a introducir?");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        int y = 0;
        int z;

        for (int i = 0; i < x; i++) {
            if (i == 0) {
                System.out.println("Introduzca un número");
            } else {
                System.out.println("Introduzca otro número");
            }
            z = scanner.nextInt();
            scanner.nextLine();

            if (z < 0) {
                y++;
            }
        }
        System.out.println(y);
    }
}
