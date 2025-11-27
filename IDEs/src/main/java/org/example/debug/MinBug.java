package org.example.debug;

public class MinBug {
    public static void main(String[] args) {
        int[] a = {5, 7, 9};
        System.out.println(min(a)); // debería 5
    }
    static int min(int[] a) {
        int m = 0;
        // Antes de cambiar ">" por "<" en línea 12 hay que cambiar aquí "0" por "a[0]"
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                // Cambiar ">" por "<" no es suficiente.
                // "m" es "0" al principio y por lo tanto no puede ser reasignado.
                m = a[i];
                // "m" es siempre asignado el nuevo valor de "a[1]".
            }
        }
        return m;
    }
}