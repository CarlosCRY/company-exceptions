package org.example;

import java.util.Scanner;
import java.util.Random;

public class Ej5 {
    public static void main (String[] args) {
        System.out.println("¿Puedes adivinar el número que he pensado?");
        Random r = new Random();
        int n = r.nextInt(100);
        int x = -1;
        Scanner scanner = new Scanner(System.in);

        while (x != n) {
            x = scanner.nextInt();
            scanner.nextLine();
            if (x < n) {
                System.out.println("¡No! ¡Te quedaste corto!");
            } else if (x > n) {
                System.out.println("¡No! ¡Te pasaste!");
            }
        }
        System.out.println("¡Exacto!");
    }
}
