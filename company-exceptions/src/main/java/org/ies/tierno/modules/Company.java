package org.ies.tierno.modules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.ies.tierno.exceptions.DepartmentNotFoundException;
import org.ies.tierno.exceptions.EmployeeNotFoundException;

import java.util.List;
import java.util.Map;

@Log4j
@Data
@AllArgsConstructor
public class Company {
    private String name;
    private String CIF;
    private Map<String, Department> departments;

    public void showDepartments () {
        departments.forEach((dName, department) -> department.showInfo());
    }

    public List<Employee> giveDepEmployees (String dName) throws DepartmentNotFoundException {
        return giveDepartment(dName).getEmployees().stream().toList();
    }

    public Department giveDepartment (String dName) throws DepartmentNotFoundException {
        if (departments.containsKey(dName)) {
            return departments.get(dName);
        } else {
            throw new DepartmentNotFoundException(dName);
        }
    }

    public Employee giveEmployee (String eNif) throws EmployeeNotFoundException {
        return departments.values().stream()
                            .flatMap(department -> department.getEmployees().stream())
                            .filter(employee -> employee.getNif().equals(eNif))
                            .findFirst()
                            .orElseThrow(() -> new EmployeeNotFoundException(eNif));
    }
}
