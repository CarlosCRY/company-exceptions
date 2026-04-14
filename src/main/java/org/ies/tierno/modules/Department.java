package org.ies.tierno.modules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;

import java.util.Set;

@Log4j
@Data
@AllArgsConstructor
public class Department {
    private String name;
    private Set<Employee> employees;

    public void showInfo () {
        log.info(name + ". Empleados: ");
        employees.forEach(employee -> employee.showInfo());
    }
}
