package org.example;

import java.util.Scanner;

public class Ej3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuLoop(scanner);
    }
    public static void optionSalute (Scanner sc) {
        System.out.println();
        System.out.println("Hola, " + askName(sc));
    }
    public static void optionYell (Scanner sc) {
        System.out.println();
        System.out.println("¡Cuidado, " + askName(sc) + "!");
    }
    public static String askName(Scanner sc) {
        System.out.println();
        System.out.println("Introduce un nombre");
        System.out.println();

        String name = "";
        do {
            name = sc.nextLine();
        } while (name.isEmpty());
        return name;
    }
    public static int menuChoice (Scanner sc) {
        System.out.println();
        System.out.println("1. Saluda");
        System.out.println("2. Grita");
        System.out.println("3. Salir");
        System.out.println();
        return sc.nextInt();
    }
    public static void menuLoop (Scanner sc) {
        int option = 0;

        do {
            option = menuChoice(sc);

            if (option == 1) {
                optionSalute(sc);
            } else if (option == 2) {
                optionYell(sc);
            } else if (option == 3) {
                System.out.println();
                System.out.println("Saliendo del programa");
            } else {
                System.out.println();
                System.out.println("Comando no valido");
            }
        } while (option != 3);
    }
}
