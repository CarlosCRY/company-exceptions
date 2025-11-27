package org.example;

public class Ej2 {
    public static void main (String[] args) {
        int[] numbers = {1, 3, 5, 0};
        announcer(sumer(numbers));
    }
    public static int sumer (int[] numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }
    public static void announcer (int x) {
        System.out.println("La suma es: " + x);
    }
}
