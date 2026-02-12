package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Ej1 {
    public static Scanner scanner = new Scanner(System.in);
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

        for (String liString: liStrings) {
            System.out.println(liString);
        }
    }
}
