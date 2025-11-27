package org.example;

import java.util.Scanner;

public class ShowSign {
    public static void main (String[] args) {
        System.out.println("Dame un numero entero.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        if (x < 0) {
            System.out.println("Es negativo.");
        } else if (x > 0) {
            System.out.println("Es positivo.");
        } else {
            System.out.println("No es positivo ni negativo.");
        }
    }
}
