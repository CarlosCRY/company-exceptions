package org.example;

import java.util.Scanner;

public class Ej2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        double x;
        double y;

        do {
            System.out.println("Introduzca operación (SUMAR, RESTA, MULTI, SALIR):");
            command = scanner.nextLine().toUpperCase();
            switch (command) {
                case "SUMAR":
                    System.out.println("Introduzca primer valor");
                    x = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Introduzca segundo valor");
                    y = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("El resultado es: " + (x + y));
                    break;

                case "RESTA":
                    System.out.println("Introduzca valor inicial");
                    x = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Introduzca valor a restar");
                    y = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("El resultado es: " + (x - y));
                    break;

                case "MULTI":
                    System.out.println("Introduzca valor inicial");
                    x = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Introduzca valor a multiplicar");
                    y = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("El resultado es :" + (x * y));
                    break;
            }
        } while (!command.equals("SALIR"));
    }
}
