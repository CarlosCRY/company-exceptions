package org.ies.tierno;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.User;

import java.util.*;

@AllArgsConstructor
public class Ej5 {
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
        for (String nif: getNifs(userByNif)) {
            System.out.println(nif);
        }
    }

    public static List<String> getNifs(Map<String, User> usersByNif) {
        List<String> nifs = new ArrayList<>();
        for (String nif: usersByNif.keySet()) {
            nifs.add(nif);
        }
        return nifs;
    }
}
