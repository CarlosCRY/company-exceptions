package org.ies.tierno;

import lombok.extern.log4j.Log4j;
import lombok.AllArgsConstructor;

import java.util.InputMismatchException;
import java.util.Scanner;

@Log4j
@AllArgsConstructor
public class StudentReader implements Reader<Student> {
    private final Scanner scanner;

    @Override
    public Student read() {
        log.info("Introduzca los datos del estudiante");
        log.info("NIF");
        String nif = scanner.nextLine();
        log.info("Nombre");
        String name = scanner.nextLine();
        log.info("Apellidos");
        String surname = scanner.nextLine();

        int zipCode = readZipCode();

        return new Student(nif, name, surname, zipCode);
    }

    public int readZipCode() {
        Integer x = null;
        do {
            try {
                log.info("Código postal");
                x = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                log.error("La inserción no es válida, vuelva a intentarlo por favor.");
            } finally {
                scanner.nextLine();
            }
        } while (x == null);
        return x;
    }
}

