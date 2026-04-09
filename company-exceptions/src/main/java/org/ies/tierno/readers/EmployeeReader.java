package org.ies.tierno.readers;

import lombok.AllArgsConstructor;

import java.util.Random;

import org.ies.tierno.modules.Employee;

@AllArgsConstructor
public class EmployeeReader implements Reader<Employee> {
    private final static String[] NAMES = {"Alberto", "Bernardo", "Carlota", "Darío", "Edurne", "Fernanda"};
    private final static String[] SURNAMES = {"Aleph", "Baal", "Caine", "Dumah", "Enoch", "Fortinbras"};
    private final static String[] POSITION = {"Jefe departamento", "Programador", "Representante"};
    private final Random random;

    @Override
    public Employee read() {
        return new Employee(
                random.nextInt(10000000, 99999999) + "X",
                NAMES[random.nextInt(NAMES.length)],
                SURNAMES[random.nextInt(POSITION.length)],
                POSITION[random.nextInt(POSITION.length)]
        );
    }
}
