package org.example;

import java.util.Scanner;

public class Ej5 {
    public static void main (String[] args) {
        System.out.println("Introduzca los números enteros contendientes:");
        Scanner scanner = new Scanner(System.in);
        int apollo = scanner.nextInt();
        int bocky = scanner.nextInt();
        int clubber = scanner.nextInt();
        int drago = scanner.nextInt();
        scanner.nextLine();

        survivorOf4(apollo, bocky, clubber, drago);
    }
    // cambiar por un solo argumento.
    public static void survivorOf4 (int a, int b, int c, int d) {
        if (a < b) {
            if (b < c) {
                if (c < d) {
                    System.out.println("El máximo es: " + d);
                } else {
                    System.out.println("El máximo es: " + c);
                }
            } else {
                if (b < d) {
                    System.out.println("El máximo es: " + d);
                } else {
                    System.out.println("El máximo es: " + b);
                }
            }
        } else {
            if (a < c) {
                if (c < d) {
                    System.out.println("El máximo es: " + d);
                } else {
                    System.out.println("El máximo es: " + c);
                }
            } else {
                if (a < d) {
                    System.out.println("El máximo es: " + d);
                } else {
                    System.out.println("El máximo es: " + a);
                }
            }
        }
    }
}

