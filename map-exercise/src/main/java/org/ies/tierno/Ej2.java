package org.ies.tierno;

import org.ies.tierno.models.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej2 {
    public static Scanner scanner = new Scanner (System.in);
    public static void main (String[] args) {
        System.out.println("Cantidad de usuarios:");
        User[] users = new User[scanner.nextInt()];
        scanner.nextLine();
        for (int i = 0; i < users.length; i++) {
            System.out.println("Introduzca NIF");
            users[i].setNif(scanner.nextLine());
            System.out.println("Introduzca nombre");
            users[i].setName(scanner.nextLine());
            System.out.println("Introduzca apellidos");
            users[i].setSurname(scanner.nextLine());
            System.out.println("Introduzca teléfono");
            users[i].setPhoneNumber(scanner.nextLine());
            System.out.println("Introduzca correo electrónico");
            users[i].setEmail(scanner.nextLine());
            System.out.println("Introduzca edad");
            users[i].setAge(scanner.nextInt());
            scanner.nextLine();
        }
        Map<String, User> userByNif = new HashMap<>();

        for (User user: users) {
            userByNif.put(user.getNif(), user);
        }
        System.out.println("Introduzca un NIF para encontrar el número de teléfono");
        String pNumber = getPhoneByNif(userByNif, scanner.nextLine());
        if (pNumber == null) {
            System.out.println("NIF no encontrado");
        } else {
            System.out.println(pNumber);
        }

    }

    public static String getPhoneByNif(Map<String, User> usersByNif, String nif) {
        if (usersByNif.containsKey(nif)) {
            User user  = usersByNif.get(nif);
            return user.getPhoneNumber();
        } else {
            return null;
        }
    }



}
