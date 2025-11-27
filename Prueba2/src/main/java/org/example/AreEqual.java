package org.example;

import java.util.Scanner;

public class AreEqual {
    public static void main (String[] args) {
        Scanner javaIsUnTruno = new Scanner(System.in);
        System.out.println("Dime un número:");
        int n1 = javaIsUnTruno.nextInt();
        javaIsUnTruno.nextLine();

        System.out.println("Dime otro número y te diré si es igual o no:");
        int n2 = javaIsUnTruno.nextInt();
        javaIsUnTruno.nextLine();

        boolean igualdad = n1 == n2;

        System.out.println(igualdad);

    }
}
