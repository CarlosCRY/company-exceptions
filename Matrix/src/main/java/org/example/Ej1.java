package org.example;

public class Ej1 {
    public static void main (String[] args) {
        int[][] followTheWhiteRabbit = {
            {2, 3, 4},
            {2, 3},
            {5, 2, 2},
        };
        int neo = 0;
        for (int[] morpheo: followTheWhiteRabbit){
            for (int trinity: morpheo) {
                neo += trinity;
            }
        }
        // Ya sé kung-fu
        System.out.println(neo);
    }
}
