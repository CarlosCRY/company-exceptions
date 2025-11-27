package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        System.out.println("Introduzca símbolo operación (+,-):");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        if (operation.equals("+")) {
            System.out.println("Dame un valor numérico");
            double a = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Dame otro valor numérico");
            double b = scanner.nextDouble();
            scanner.nextLine();

            double x = a + b;

            System.out.println(x);

        } else if (operation.equals("-")) {
            System.out.println("Dame un valor numérico");
            double a = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Dame otro valor numérico");
            double b = scanner.nextDouble();
            scanner.nextLine();

            double x = a - b;

            System.out.println(x);
        } else {
            System.out.println("Operación invalida");
        }
    }
}
