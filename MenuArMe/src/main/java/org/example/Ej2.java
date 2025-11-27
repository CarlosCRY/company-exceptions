package org.example;

import java.util.Scanner;

public class Ej2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Bienvenido a MeCrySong Arrayer Net 0.666");
        System.out.println("¿Que deseas hacer hoy?");
        System.out.println();
        loop();
    }
    public static int posIntInput () {
        int x;
        do {
            x = scanner.nextInt();
            scanner.nextLine();
            if (x < 0) {
                System.out.println();
                System.out.println("Valor no válido, introduzca un entero positivo");
                System.out.println();
            }
        } while (x < 0);
        return x;
    }
    public static double[] arrayer () {
        System.out.println();
        System.out.println("Introduzca la cantidad de números que quiere introducir");
        System.out.println();
        int n = posIntInput();

        System.out.println();
        System.out.println("Valor válido. Puede ir introduciendo los números que desee");
        System.out.println();
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        return x;
    }
    public static void loop () {
        int option;
        do {
            option = menuOption();
            optionFork(option);
        } while (option != 3);
    }
    public static int menuOption () {
        int choice;
        do {
            System.out.println();
            System.out.println("1. La suma total de una lista.");
            System.out.println("2. Multiplicar array por 2");
            System.out.println("3. Salir");
            System.out.println();
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 1 || choice > 3) {
                System.out.println();
                System.out.println("No es una opción válida. Las opciones válidas son:");
            }
        } while (choice < 1 || choice > 3);
        return choice;
    }
    public static void optionFork (int x) {
        switch (x) {
            case 1:
                System.out.println();
                System.out.println("El total de la lista dada es: " + sum(arrayer()));
                break;
            case 2:
                double[] multiplieds = douArrays(arrayer()); 
                System.out.println();
                System.out.println("Los números del array multiplicados por 2 son los siguientes:");
                for (double multiplied: multiplieds) {
                    System.out.print(multiplied + " ");
                }
                break;
            case 3:
                System.out.println();
                System.out.println("Que tenga un buen día.");
                break;
        }
    }
    public static double sum (double[] numbers) {
        double x = 0;
        for (double number: numbers) {
            x += number;
        }
        return x;
    }
    public static double[] douArrays (double[] numbers) {
        double[] returners = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            returners[i] = numbers[i] * 2;
        }
        return returners;
    }
}
