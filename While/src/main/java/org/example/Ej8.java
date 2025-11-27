package org.example;

import java.util.Scanner;

public class Ej8 {
    public static void main (String[] args) {
        System.out.println("Introduzca 10 números");
        // Otra vez, un bucle "for" sería más conveniente.
        Scanner scanner = new Scanner(System.in);
        int i = 10;
        int pCount = 0;
        double pSum = 0;
        int nCount = 0;
        double nSum = 0;
        int oCount = 0;

        double x = 0;

        while (i > 0) {
            x = scanner.nextDouble();
            if (x > 0) {
                pCount++;
                pSum += x;
            } else if (x < 0) {
                nCount++;
                nSum += x;
            } else {
                oCount++;
            }
            i--;
        }
        System.out.println("Media de positivos: " + pSum / pCount);
        System.out.println("Media de negativos " + nSum / nCount);
        System.out.println("Veces que se introdujo 0 :" + oCount);
    }
}
