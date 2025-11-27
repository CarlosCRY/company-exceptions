package org.example;

import java.util.Scanner;

public class Ej5 {
    public static void main (String[] args) {
        System.out.println("Introduzca un número entero positivo");
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();

        System.out.println("Introduzca otro número entero positivo");
        int v2 = scanner.nextInt();

        if (v1 > v2) {
            int temp = v1;
            v1 = v2;
            v2 = temp;
        }

        for (int i = v1; i <= v2; i++) {
            System.out.print("Sumatorio de " + i + ": ");
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
                if (j > 0) {
                    System.out.print(" + ");
                } else{
                    System.out.println("");
                }
            }
        }
    }
}
