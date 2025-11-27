package org.example;

import java.util.Scanner;

public class StringSizeCheck {
    public static void main (String[] args) {
        System.out.println("Dime una palabrita de 8 letras.");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.length() < 8) {
            System.out.println("Demasiado pequeño");
        } else if (s.length() > 8 ) {
            System.out.println("Demasiado grande");
        } else {
            System.out.println("Es Válido.");
        }
    }
}
