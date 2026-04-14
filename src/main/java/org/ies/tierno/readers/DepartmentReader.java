package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.modules.Department;
import org.ies.tierno.modules.Employee;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@AllArgsConstructor
public class DepartmentReader implements Reader<Department> {
    private final Random random;
    private final Reader<Employee> employeeReader;

    @Override
    public Department read() {
        Set<Employee> employees = new HashSet<>();
        for (int i = random.nextInt(1,10); i > 0; i--) {
            employees.add(employeeReader.read());
        }
        return new Department(
                "Departamento",
                employees
        );
    }
}
