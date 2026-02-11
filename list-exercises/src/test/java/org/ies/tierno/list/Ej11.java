package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej11 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        List<Double> numbers = new ArrayList<>();
        System.out.println("Puedes empezar a introducir números naturales de la primera lista.");
        List<Double> numbers1 = numbersAsker();
        System.out.println("Puedes empezar a introducir números naturales de la segunda lista.");
        List<Double> numbers2 = numbersAsker();
        for (double unioned: union(numbers1, numbers2)) {
            System.out.println(unioned);
        }
    }

    public static List<Double> union(List<Double> numbers1, List<Double> numbers2) {
        List<Double> unioners = new ArrayList<>();
        for (double number: numbers1) {
            unioners.add(number);
        }
        for (double number: numbers2) {
            unioners.add(number);
        }
        return unioners;
    }

    private static List<Double> numbersAsker() {
        List<Double> returners = new ArrayList<>();
        boolean finish = false;
        boolean answer = false;
        do {
            returners.add(scanner.nextDouble());
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
        return returners;
    }
}
