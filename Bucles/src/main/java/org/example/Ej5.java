package org.example;

import java.util.Scanner;

public class Ej5 {
    public static void main (String[] args) {
        System.out.println("Dime un año");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dime otro año");
        int y = scanner.nextInt();
        scanner.nextLine();

        int min;
        int max;

        if (x < y) {
            min = x;
            max = y;
        } else {
            min = y;
            max = x;
        }

        for (int i = min; i <= max; i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                System.out.println(i);
            }
        }
    }
}
