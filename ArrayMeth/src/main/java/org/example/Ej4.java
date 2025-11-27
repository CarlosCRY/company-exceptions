package org.example;

import java.util.Scanner;

public class Ej4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Introduzca un lista de números, por favor");
        System.out.println("Empiece introduciendo la cantidad de números que quiere usar");

        double[] x = douArrInv(arrayInput());

        System.out.println();
        System.out.println("La lista de números que ha introducido al revés es:");
        arrayAnoun(x);

        System.out.println("Introduzca otra lista de números siguiendo el mismo método");

        double[] y = douArrInv(arrayInput());

        System.out.println();
        System.out.println("La nueva lista de números introducida al revés sería:");
        arrayAnoun(y);

        System.out.println();
        System.out.println("Ambas listas con sus números en orden inverso serían:");
        arrayAnoun(douArrJoi(x, y));
    }
    public static double[] arrayInput () {
        boolean valid = false;
        int x;
        do {
            x = scanner.nextInt();
            scanner.nextLine();
            if (x < 1) {
                System.out.println();
                System.out.println("El valor no es válido, introduzca otro por favor.");
                System.out.println();
            } else {
                valid = true;
            }
        } while (!valid);
        System.out.println();
        System.out.println("Valor válido, introduzca los números");
        System.out.println();
        double[] y = new double[x];
        for (int i = 0; i < y.length; i++) {
            y[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        return y;
    }
    public static void arrayAnoun (double[] numbers) {
        System.out.println();
        for (double number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static double[] douArrInv (double[] x) {
        double[] y = new double[x.length];
        for (int i = 0; i < y.length; i++) {
            y[i] = x[y.length - i - 1];
        }
        return y;
    }
    public static double[] douArrJoi (double[] x, double[] y) {
        double[] z = new double[x.length + y.length];
        for (int i = 0; i < z.length; i++) {
            if (i < x.length) {
                z[i] = x[i];
            } else {
                z[i] = y[i - x.length];
            }
        }
        return z;
    }
}
