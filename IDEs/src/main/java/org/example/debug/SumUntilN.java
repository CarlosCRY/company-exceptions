package org.example.debug;

public class SumUntilN {
    public static void main(String[] args) {
        System.out.println(sum(5)); // esperado 15
    }
    static int sum(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            // "i" no pasa de de "4". Hay que cambiar "<" por "<="
            s += i;
        }
        return s;
    }
    // comentario
}