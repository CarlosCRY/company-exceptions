package org.example;

import java.util.Scanner;

public class Ej4 {
    public static void main (String[] args) {
        System.out.println("Dime un número");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        int y = 1;

        for (int i = 1; i <= x; i++) {
            y = y * i;
            if (i < x) {
                System.out.println(i + " *");
            } else if (i == x) {
                System.out.println(i);
            }
        }
        System.out.println("= " + y);
    }
}
