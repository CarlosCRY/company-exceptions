package org.example;

import java.util.Scanner;

public class Ej5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            option = menuChoice(scanner);

            if (option == 1) {
                optionSum(scanner);
            } else if (option == 2) {
                optionFac(scanner);
            } else if (option == 3) {
                optionMed(scanner);
            } else if (option == 4) {
                System.out.println();
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println();
                System.out.println("Comando no valido");
            }
        } while (option != 4);
    }
    public static void optionSum (Scanner sc) {
        System.out.println();
        System.out.println("Introduzca un número entero positivo");
        System.out.println();
        int x = sc.nextInt();
        sc.nextLine();
        int y = 0;
        System.out.println();
        for (int i = 0; i <= x; i++) {
            System.out.print(i);
            y += i;
            if (i == x) {
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }
        }
        System.out.println(y);
    }
    public static void optionFac (Scanner sc) {
        System.out.println();
        System.out.println("Introduzca un número entero positivo");
        System.out.println();
        int x = sc.nextInt();
        sc.nextLine();
        int y = 1;
        System.out.println();
        for (int i = 1; i <= x; i++) {
            System.out.print(i);
            y = y * i;
            if (i == x) {
                System.out.print(" = ");
            } else {
                System.out.print(" * ");
            }
        }
        System.out.println(y);
    }
    public static void optionMed(Scanner sc) {
        System.out.println();
        System.out.println("Introduzca un total de 4 valores para hacer la media.");
        System.out.println();
        double x = 0;
        for (int i = 0; i < 4; i++) {
            x += sc.nextDouble();
            sc.nextLine();
        }
        System.out.println();
        System.out.println("La media es: " + (x / 4));
    }
    public static int menuChoice (Scanner sc) {
        System.out.println();
        System.out.println("1. Sumatorio");
        System.out.println("2. Factorial");
        System.out.println("3. Media");
        System.out.println("4. Salir del programa");
        System.out.println();
        return sc.nextInt();
    }
}

