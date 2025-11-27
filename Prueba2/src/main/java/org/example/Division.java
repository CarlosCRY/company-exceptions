package org.example;

import java.util.Scanner;

public class Division {
    public static void main (String[] args) {
        Scanner javaIsUnTruno = new Scanner(System.in);
        System.out.println("¡Vamos a dividir! Dime un número:");
        double n1 = javaIsUnTruno.nextDouble();
        javaIsUnTruno.nextLine();

        System.out.println("Y lo dividimos por...");
        double n2 = javaIsUnTruno.nextDouble();
        javaIsUnTruno.nextLine();

        double x =n1 / n2;

        System.out.println("El resultado de la división es " + x);


    }
}
