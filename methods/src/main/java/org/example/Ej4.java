package org.example;

import java.util.Scanner;

public class Ej4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuLoop(scanner);
    }
    public static void optionSum (Scanner sc) {
        System.out.println();
        System.out.println("Introduzca primer valor a sumar");
        System.out.println();
        double x = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println("Introduzca segundo valor a sumar");
        System.out.println();
        double y = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println(x + " + " + y + " = " + (x + y));

    }
    public static void optionSub (Scanner sc) {
        System.out.println();
        System.out.println("Introduzca valor inicial");
        System.out.println();
        double x = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println("Introduzca valor a restar");
        System.out.println();
        double y = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println(x + " - " + y + " = " + (x - y));
    }
    public static void optionMul(Scanner sc) {
        System.out.println();
        System.out.println("Introduzca valor a multiplicar");
        System.out.println();
        double x = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println("Introduzca valor múltiplo");
        System.out.println();
        double y = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        System.out.println(x + " x " + y + " = " + (x * y));
    }
    public static int menuChoice (Scanner sc) {
        System.out.println();
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. MATAR PROGRAMA");
        System.out.println();
        return sc.nextInt();
    }
    public static void menuLoop (Scanner sc) {
        int option = 0;

        do {
            option = menuChoice(sc);

            if (option == 1) {
                optionSum(sc);
            } else if (option == 2) {
                optionSub(sc);
            } else if (option == 3) {
                optionMul(sc);
            } else if (option == 4) {
                System.out.println();
                System.out.println("4NE!!!!");
            } else {
                System.out.println();
                System.out.println("Comando no valido");
            }
        } while (option != 4);
    }
}
