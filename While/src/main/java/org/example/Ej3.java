package org.example;

import java.util.Scanner;

public class Ej3 {
    public static void main (String[] args) {
            boolean conti = true;
            Scanner scanner = new Scanner(System.in);

            while (conti) {
                System.out.print("Introduce número: ");
                scanner.nextDouble();
                scanner.nextLine();

                System.out.print("¿Quieres seguir? ");
                if (!scanner.nextLine().equalsIgnoreCase("S")) {
                    conti = false;
                }
            }
    }
}
