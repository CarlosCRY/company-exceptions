package org.example;

import java.util.Scanner;

public class Ej9 {
    public static void main (String[] args) {
        System.out.println("Díme un número primo");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        boolean primo = false;

        if (x >= 2) {
            primo = true;
        }

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("Sí, es un número primo");
        } else {
            System.out.println("No es primo ¡No seas primo!");
        }
    }
}
