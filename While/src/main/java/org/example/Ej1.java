package org.example;

import java.util.Scanner;

public class Ej1 {
    public static void main (String[] args) {
        System.out.println("Dime un número");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dime un número mayor");
        int y = scanner.nextInt();
        scanner.nextLine();

        while (x >= y) {
            System.out.println("¡No! ¡No lo es! Prueba otra vez");
            y = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(x + ", " + y + " ¡Correcto! ¿Ves que como no es tan difícil?");
    }
}
