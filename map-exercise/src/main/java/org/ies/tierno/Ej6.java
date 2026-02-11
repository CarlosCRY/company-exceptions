package org.ies.tierno;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@AllArgsConstructor
public class Ej6 {
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
        System.out.println("Introduzca el NIF del usuario cuyo teléfono quiere cambiar");
        String nifToChange = scanner.nextLine();

        userByNif = changePN(userByNif, nifToChange, scanner.nextLine());
    }

    public static Map<String, User> changePN (Map <String, User> usersByNif, String nif, String pNumber) {
        if (usersByNif.containsKey(nif)) {
            User changed = usersByNif.get(nif);
            changed.setPhoneNumber(pNumber);
            usersByNif.put(changed.getNif(), changed);
            System.out.println("El número de teléfono ha sido cambiado satisfactoriamente.");
        } else {
            System.out.println("NIF no encontrado. cambio cancelado.");
        }
        return usersByNif;
    }
}
