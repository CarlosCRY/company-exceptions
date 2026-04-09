package org.ies.tierno.exceptions;

public class EmployeeNotFoundException extends Exception{
    private final String employeeNif;

    public EmployeeNotFoundException(String employeeNif) {
        this.employeeNif = employeeNif;
    }

    public String getEmployeeNif() {
        return employeeNif;
    }
}
