package org.example;

import java.util.Scanner;

public class AreNotEqual {
    public static void main (String[] args) {
        Scanner javaIsUnTruno = new Scanner(System.in);
        System.out.println("Vamos a hacer algo un poco raro, dime un numerito.");
        int n1 = javaIsUnTruno.nextInt();
        javaIsUnTruno.nextLine();

        System.out.println("Dime otro numerito y te diré... Si es diferente o no:");
        int n2 = javaIsUnTruno.nextInt();
        javaIsUnTruno.nextLine();

        boolean diversidad = n1 != n2;

        System.out.println(diversidad);
    }
}
