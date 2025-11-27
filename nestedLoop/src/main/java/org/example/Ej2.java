package org.example;

import java.util.Scanner;

public class Ej2 {
    public static void main (String[] args) {
        System.out.println("Introduzca un número entero positivo:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                if (j < i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println("");
                }
            }
        }

    }
}
