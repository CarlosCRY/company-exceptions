package org.example;

import java.util.Scanner;

public class Ej3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Introduzca el valor de la matriz:");
        System.out.println();

        int n = bePositive();

        System.out.println();

        matrixReader(douception(architect(n)));

    }
    public static int bePositive () {
        int x;
        do {
            x = scanner.nextInt();
            if (x < 1) {
                System.out.println();
                System.out.println("Valor no válido. Introduzca un valor positivo");
            }
        } while (x < 1);
        return x;
    }
    public static int[][] architect (int x) {
        int[][] y = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                y[i][j] = j + i;
            }
        }
        return y;
    }
    public static int[][] douception (int[][] x) {
        int[][] y = x;
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                y[i][j] = y[i][j] * 2;
            }
        }
        return y;
    }
    public static void matrixReader (int[][] matrix) {
        for (int[] numbers: matrix) {
            for (int number: numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
