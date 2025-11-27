package org.example;

import java.util.Scanner;

public class Ej4 {
    public static void main (String[] args) {
        System.out.println("Introduzca los números enteros contendientes:");
        Scanner scanner = new Scanner(System.in);
        int apollo = scanner.nextInt();
        int bocky = scanner.nextInt();
        int clubber = scanner.nextInt();
        int drago = scanner.nextInt();
        scanner.nextLine();

        System.out.println("El número mayor es: " + greatOf4(apollo, bocky, clubber, drago));
    }
    public static int greatOf4 (int a, int b, int c, int d) {
        int great;
        if (a < b) {
            if (b < c) {
                if (c < d) {
                    great = d;
                } else {
                    great = c;
                }
            } else {
                if (b < d) {
                    great = d;
                } else {
                    great = b;
                }
            }
        } else {
            if (a < c) {
                if (c < d) {
                    great = d;
                } else {
                    great = c;
                }
            } else {
                if (a < d) {
                    great = d;
                } else {
                    great = a;
                }
            }
        }
        return great;
    }
}
