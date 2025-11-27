package org.example;

import java.util.Scanner;

public class Multiplication {
    public static void main (String[] args) {
        Scanner javaIsUnTruno = new Scanner(System.in);
        System.out.println("¡Y ahora multiplicar! Dime un numerito.");
        int n1 = javaIsUnTruno.nextInt();
        javaIsUnTruno.nextLine();

        System.out.println("Y lo multiplicamos por:");
        int n2 = javaIsUnTruno.nextInt();
        javaIsUnTruno.nextLine();

        int x = n1 * n2;

        System.out.println("El resultado de la multiplicación es " + x);

    }
}
