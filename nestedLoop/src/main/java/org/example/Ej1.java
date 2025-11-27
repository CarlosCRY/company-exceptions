package org.example;

import java.util.Scanner;

public class Ej1 {
    public static void main (String[] args) {
        System.out.println("Introduzca un número entero positivo:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + i);
                if (j < n) {
                    System.out.print(" ");
                } else {
                    System.out.println("");
                }
            }
        }

    }
}
