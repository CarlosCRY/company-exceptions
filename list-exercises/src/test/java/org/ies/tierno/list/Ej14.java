package org.ies.tierno.list;

import org.ies.tierno.list.pojos.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej14 {
    public static Scanner scanner = new Scanner(System.in);
    public static Student studentReg () {
        System.out.println("Introduzca nombre");
        String name = scanner.nextLine();
        System.out.println("Introduzca apellidos");
        String surname = scanner.nextLine();
        System.out.println("Introduzca e-mail");
        String email = scanner.nextLine();
        System.out.println("Introduzca código ZIP");
        int zip = scanner.nextInt();
        scanner.nextLine();

        return new Student(
                name,
                surname,
                email,
                zip
        );
    }
    public static List<String> mapToEmails(List<Student> students) {
        List<String> emilios = new ArrayList<>();
        for (Student student: students) {
            emilios.add(student.getEmail());
        }
        return emilios;
    }
    public static void main (String[] args) {
        List<Student> students = new ArrayList<>();
        boolean finish = false;
        boolean answer = false;
        do {
            students.add(studentReg());
            System.out.println("¿Registrar otro estudiante? S/N");
            do {
                switch (scanner.nextLine().toUpperCase()) {
                    case "S":
                    case "SÍ":
                    case "SI":
                    case "Y":
                    case "YES":
                    case "YE":
                        answer = true;
                        break;
                    case "N":
                    case "NO":
                        answer = true;
                        finish = true;
                        break;
                    default:
                        System.out.println("No es una opción válida");
                }
            } while (!answer);
        } while (!finish);

        for (String emilio: mapToEmails(students)) {
            System.out.println(emilio);
        }
    }
}
