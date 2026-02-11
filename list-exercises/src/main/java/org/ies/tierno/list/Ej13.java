package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej13 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Puedes empezar a introducir números naturales de la primera lista.");
        List<Double> numbers1 = numbersAsker();
        System.out.println("Puedes empezar a introducir números naturales de la segunda lista.");
        List<Double> numbers2 = numbersAsker();
        for (double junctioned : removeAll(numbers1, numbers2)) {
            System.out.println(junctioned);
        }
    }

    public static List<Double> removeAll(List<Double> numbers, List<Double> numbersToRemove) {
        List<Double> returners = new ArrayList<>();
        for (double number : numbers) {
            if (!numbersToRemove.contains(number)) {
                returners.add(number);
            }
        }
        return returners;
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
                        answer = true;
                        finish = true;
                        break;
                    default:
                        System.out.println("No es una opción válida");
                }
            } while (!answer);
        } while (!finish);
        return returners;
    }
}
