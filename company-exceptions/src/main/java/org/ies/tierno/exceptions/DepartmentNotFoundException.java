package org.ies.tierno.exceptions;

public class DepartmentNotFoundException extends Exception{
    private final String departmentName;

    public DepartmentNotFoundException(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
