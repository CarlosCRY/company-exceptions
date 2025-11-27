package org.example;

import java.util.Scanner;

public class Ej4 {
    public static void main (String[] args) {
        System.out.println("¿Cuantos nombres quiere introducir?");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[scanner.nextInt()];
        scanner.nextLine();
        System.out.println();
        System.out.println("Introduzca los nombres");
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.println();
        System.out.println("Estos son los nombres que has introducido:");
        System.out.println();
        for (String name: names) {
            System.out.println(name);
        }
    }
}
