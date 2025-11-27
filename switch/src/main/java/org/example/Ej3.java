package org.example;

import java.util.Scanner;

public class Ej3 {
    public static void main (String[] args) {
        System.out.println("Introduzca una palabra de 8 letras:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();

        switch (l) {
            case 8:
                System.out.println("Es válido");
                break;
            default:
                System.out.println("No es válido");
                break;
        }
    }
}
