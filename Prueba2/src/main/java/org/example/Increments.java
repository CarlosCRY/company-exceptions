package org.example;

import java.util.Scanner;

public class Increments {
    public static void main (String[] args) {
        Scanner javaIsUnTruno = new Scanner(System.in);
        System.out.println("Dime un numerito.");
        double n = javaIsUnTruno.nextDouble();
        javaIsUnTruno.nextLine();
        n++;
        n++;
        System.out.println("El resultado es " + n);
    }
}
