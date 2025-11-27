package org.example.debug;

public class AverageProgram {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 0, 2};
        double avg = findAverage(numbers);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(int[] numbers) {
        double sum = 0;
        double average = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;
        return average;
    }
}
