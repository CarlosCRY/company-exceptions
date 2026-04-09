package org.ies.tierno;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Ej1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        List<String> strings = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                strings.add(input);
            }
        }
        strings.forEach(string -> System.out.println(string));
    }
}
