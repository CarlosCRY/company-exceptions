package org.example;

import java.util.Scanner;

public class Ej1 {
    public static void main (String[] args) {
        System.out.println("Introduzca 2 números");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();

        announce(sum(a, b));
    }
    public static void announce (int x){
        System.out.println("El resultado es: " + x);
    }
    public static int sum (int x, int y){
        return x + y;
    }
}
