package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void addAtBeggining(List<String> list, String value) {
        list.add(0, value);
    }
    public static void main (String[] args) {
        List<String> liStrings = new ArrayList<>();
        String input;
        System.out.println("Introduce un nuevo string o pulsa enter para finalizar.");
        do {
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                liStrings.add(input);
            }
        } while (!input.isEmpty());

        System.out.println("Añade un string al principio del array");

        addAtBeggining(liStrings, scanner.nextLine());

        for (String liString: liStrings) {
            System.out.println(liString);
        }
    }
}
