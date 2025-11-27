package org.example;

import java.util.Scanner;

public class isEven {
    public static void main (String[] args) {
        System.out.println("Dime un número par.");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        float rest = x % 2;

        if (x == 0) {
            System.out.println("No es ni par ni impar.");
        } else if (rest == 0) {
            System.out.println("Es par.");
        }
    }
}
