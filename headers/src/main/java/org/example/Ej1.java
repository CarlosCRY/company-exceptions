package org.example;

import java.util.Scanner;

public class Ej1 {
    public static void main (String[] args) {
        System.out.println("Dame 2 números enteros");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        System.out.println("La suma es: " + sum(a, b));
    }
    public static int sum (int x, int y) {
        return x + y;
    }
}
