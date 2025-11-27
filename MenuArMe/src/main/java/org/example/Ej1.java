package org.example;

import java.util.Scanner;

public class Ej1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Bienvenido a MeCrySong Arrayer 0.83");
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
        } while (option != 4);
    }
    public static int menuOption () {
        int choice;
        do {
            System.out.println();
            System.out.println("1. Buscar el número de mayor valor en una lista");
            System.out.println("2. Buscar el número de menor valor en una lista");
            System.out.println("3. Buscar la media en una lista de números");
            System.out.println("4. Salir");
            System.out.println();
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice < 1 || choice > 4) {
                System.out.println();
                System.out.println("No es una opción válida. Las opciones válidas son:");
            }
        } while (choice < 1 || choice > 4);
        return choice;
    }
    public static void optionFork (int x) {
        switch (x) {
            case 1:
                System.out.println();
                System.out.println("El número más alto de la lista dada es: " + maximus(arrayer()));
                break;
            case 2:
                System.out.println();
                System.out.println("El número más bajo de la lista dada es: " + minimum(arrayer()));
                break;
            case 3:
                System.out.println();
                System.out.println("La media de la lista dada es: " + medium(arrayer()));
                break;
            case 4:
                System.out.println();
                System.out.println("Que tenga un buen día.");
                break;
        }
    }
    public static double maximus (double[] numbers) {
        double x = numbers[0];
        for (double number: numbers) {
            if (x < number) {
                x = number;
            }
        }
        return x;
    }
    public static double minimum (double[] numbers) {
        double x = numbers[0];
        for (double number: numbers) {
            if (x > number) {
                x = number;
            }
        }
        return x;
    }
    public static double medium (double[] numbers) {
        double x = 0;
        for (double number: numbers) {
            x += number;
        }
        return x / numbers.length;
    }
}
