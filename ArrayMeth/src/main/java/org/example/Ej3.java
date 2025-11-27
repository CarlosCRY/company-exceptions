package org.example;

import java.util.Scanner;

public class Ej3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("¿Cuantos números quieres introducir?");
        System.out.println("Introduzca un número positivo entero para ello.");
        announceD(makeMedia(makeIntArr(askPosInt())));
    }
    public static int askPosInt () {
        boolean valid = false;
        int x;
        do {
            x = scanner.nextInt();
            scanner.nextLine();
            if (x < 1 ) {
                System.out.println();
                System.out.println("El valor no es válido, introduzca otro por favor.");
                System.out.println();
            } else {
                valid = true;
            }
        } while (!valid);
        return x;
    }
    public static double[] makeIntArr (int x) {
        double[] y = new double[x];
        System.out.println();
        System.out.println("Cantidad de números válida, vaya introduciéndolos por favor.");
        System.out.println();
        for (int i = 0; i < y.length; i++) {
            y[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        return y;
    }
    public static double makeMedia (double[] numbers) {
        double x = 0;
        for (double number: numbers) {
            x += number;
        }
        return x / numbers.length;
    }
    public static void announceD (double x) {
        System.out.println();
        System.out.println("La media es: " + x);
    }
}
