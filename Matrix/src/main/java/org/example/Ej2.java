package org.example;

import java.util.Scanner;

public class Ej2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Introduzca el valor de la matriz:");
        System.out.println();

        int n = bePositive();

        System.out.println();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = j + (i * n);
            }
        }
        for (int[] numbers: matrix) {
            for (int number: numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
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
}
