package org.ies.tierno.app;

import org.ies.tierno.exceptions.*;
import org.ies.tierno.modules.*;
import org.ies.tierno.readers.CompanyReader;

import lombok.extern.log4j.Log4j;
import lombok.AllArgsConstructor;

import java.util.InputMismatchException;
import java.util.Scanner;

@Log4j
@AllArgsConstructor
public class CompanyApp implements App {
    private final Scanner scanner;
    private final CompanyReader companyReader;

    public void run () {
        Company cDB = companyReader.read();
        log.info("Bienvenido a la base de datos de " + cDB.getName());
        int command = 0;
        do {
            menu();
            try {
                command = scanner.nextInt();
                scanner.nextLine();
                input(cDB, command);
            } catch (InputMismatchException e) {
                log.error("La entrada no es válida", e);
            } catch (InvalidCommandNumber e) {
                log.error("Entrada de comando no válida.", e);
            }
        } while (command != 5);
    }

    public static void menu () {
        log.info("Introduzca uno de los siguientes comandos:\n\n1- Mostrar todos los departamentos." +
                "\n2- Mostrar empleados de un departamento.\n3- Mostrar departamento.\n4- Mostrar empleado." +
                "\n5- Salir.");
    }

    public void input(Company cDB, int x) throws InvalidCommandNumber {
        if (x < 0 || x > 5) {
            throw new InvalidCommandNumber(x);
        }
        switch (x) {
            case 1:
                cDB.showDepartments();
                break;
            case 2:
                log.info("Introduzca el nombre del departamento.\"Pista: Departamento #");
                try {
                    cDB.giveDepEmployees(scanner.nextLine()).forEach(employee -> employee.showInfo());
                } catch (DepartmentNotFoundException e) {
                    log.error("No se ha encontrado el departamento, revise la entrada", e);
                }
                break;
            case 3:
                log.info("Introduzca el nombre del departamento.\"Pista: Departamento #");
                try {
                    cDB.giveDepartment(scanner.nextLine()).showInfo();
                } catch (DepartmentNotFoundException e) {
                    log.error("No se ha encontrado el departamento, revise la entrada", e);
                }
                break;
            case 4:
                log.info("Introduzca el NIF del empleado.");
                try {
                    cDB.giveEmployee(scanner.nextLine()).showInfo();
                } catch (EmployeeNotFoundException e) {
                    log.error("No se ha encontrado empleado con el NIF dado, revise la entrada", e);
                }
                break;
            case 5:
                log.info("Finalizando programa");
        }
    }
}
