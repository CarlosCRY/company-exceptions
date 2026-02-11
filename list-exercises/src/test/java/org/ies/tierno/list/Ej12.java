package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej12 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Puedes empezar a introducir números naturales de la primera lista.");
        List<Double> numbers1 = numbersAsker();
        System.out.println("Puedes empezar a introducir números naturales de la segunda lista.");
        List<Double> numbers2 = numbersAsker();
        for (double junctioned : junction(numbers1, numbers2)) {
            System.out.println(junctioned);
        }
    }

    public static List<Double> junction(List<Double> numbers1, List<Double> numbers2) {
        List<Double> junctioners = new ArrayList<>();
        for (double number1 : numbers1) {
            if (numbers2.contains(number1)) {
                junctioners.add(number1);
            }
        }
        return junctioners;
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
