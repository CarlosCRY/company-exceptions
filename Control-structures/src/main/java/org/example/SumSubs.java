package org.example;

import java.util.Scanner;

public class SumSubs {
    public static void main (String[] args) {
        System.out.println("Pídeme un número.");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pídeme otro número.");
        int b = scanner.nextInt();
        scanner.nextLine();

        if (a > b) {
            System.out.println(a + b);
        } else if (a < b) {
            System.out.println(a - b);
        } else {
            System.out.println("¡Son iguales! Dime otro número.");
            int c = scanner.nextInt();
            scanner.nextLine();
            if (c > (a + b)) {
                System.out.println("c es mayor que a + b");
            } else if (c < (a + b)) {
                System.out.println("c es menor que a + b");
            } else {
                System.out.println("c es igual que a + b");
            }

        }
    }
}
