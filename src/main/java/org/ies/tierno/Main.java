package org.ies.tierno;

import org.ies.tierno.app.CompanyApp;
import org.ies.tierno.readers.CompanyReader;
import org.ies.tierno.readers.DepartmentReader;
import org.ies.tierno.readers.EmployeeReader;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        EmployeeReader employeeReader = new EmployeeReader(random);
        DepartmentReader departmentReader = new DepartmentReader(random, employeeReader);
        CompanyReader companyReader = new CompanyReader(random, departmentReader);
        CompanyApp companyApp = new CompanyApp(scanner, companyReader);

        companyApp.run();
    }
}