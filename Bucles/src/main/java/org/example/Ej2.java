package org.example;

import java.util.Scanner;

public class Ej2 {
    public static void main (String[] args){
        System.out.println("Dime un número");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dime otro número");
        int y = scanner.nextInt();
        scanner.nextLine();

        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        }
    }
}
