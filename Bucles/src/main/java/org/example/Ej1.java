package org.example;

import java.util.Scanner;

public class Ej1 {
    public static void main (String[] args) {
        System.out.println("Dime cuantas iteraciones:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dame un mensaje:");
        String s = scanner.nextLine();

        for (int i = 0; i < x; i++) {
            System.out.println(s);
        }
    }
}
