package org.example;

import java.util.Scanner;

public class Ej2 {
    public static void main (String[] args) {
        System.out.println("Introduzca símbolo de la operación (+ o -)");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println("Introduzca valor inicial");
                double ns1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Introduzca valor suma");
                double ns2 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(ns1 + ns2);
                break;
            case "-":
                System.out.println("Introduzca valor inicial");
                double nr1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Introduzca valor resta");
                double nr2 = scanner.nextDouble();
                scanner.nextLine();

                System.out.println(nr1 + nr2);
                break;

            default:
                System.out.println("Operación inválida");
                break;
        }
    }
}
