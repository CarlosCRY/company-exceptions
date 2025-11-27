package org.example;

import java.util.Scanner;

public class Ej2 {
    public static void main (String[] args) {
        System.out.println("Dame 2 números enteros");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        announceSum(a, b);
    }
    // cambiar por un solo argumento.
    public static void announceSum (int x, int y) {
        System.out.println("El resultado es: " + (x + y));
    }
}
