package org.example;

public class Ej1 {
    public static void main (String[] args) {
        int[] numbers = {1, 3, 5, 0};
        announcer(maximus(numbers));
    }
    public static int maximus (int[] numbers) {
        int max = 0;
        for (int number: numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
    public static void announcer (int x) {
        System.out.println("El máximo es: " + x);
    }
}
