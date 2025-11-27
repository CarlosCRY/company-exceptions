package org.example;

import java.util.Scanner;

public class Ej3 {
    public static void main (String[] args) {
        System.out.println("Dame 2 números para multiplicar");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("El resultado es: " + multi(a, b));
    }
    public static int multi (int x, int y) {
        return x * y;
    }
}
