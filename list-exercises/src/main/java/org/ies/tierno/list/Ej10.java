package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej10 {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Integer> sum10(List<Integer> numbers) {
        List<Integer> x = new ArrayList<>();
        for (int number: numbers) {
            x.add(number + 10);
        }
        return x;
    }

    public static void main (String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Puedes empezar a introducir números enteros.");
        boolean finish = false;
        boolean answer = false;
        do {
            numbers.add(scanner.nextInt());
            scanner.nextLine();
            System.out.println("¿Deseas continuar? S/N:");
            do {
                switch (scanner.nextLine().toUpperCase()) {
                    case "S":
                    case "SÍ":
                    case "SI":
                    case "Y":
                    case "YES":
                    case "YE":
                        answer = true;
                        break;
                    case "N":
                    case "NO":
                        finish = true;
                        answer = true;
                        break;
                    default:
                        System.out.println("No es una opción válida");
                }
            } while (!answer);
        } while (!finish);
        for (int number: sum10(numbers)) {
            System.out.println(number);
        }
    }
}
