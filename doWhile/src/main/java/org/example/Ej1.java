package org.example;

import java.util.Scanner;

public class Ej1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String command;
        do {
            System.out.println("Comando:");
            command = scanner.nextLine().toUpperCase();
            switch (command) {
                case "SALUDA":
                    do {
                        System.out.println("Introduzca un nombre:");
                        name = scanner.nextLine();
                    } while (name.isEmpty());
                    System.out.println("Hola, " + name);
                    break;
                case "GRITA":
                    do {
                        System.out.println("Introduzca un nombre:");
                        name = scanner.nextLine();
                    } while (name.isEmpty());
                    System.out.println("¡Cuidado, " + name + " !");
                    break;
            }
        } while (!command.equals("SALIR"));
    }
}
