package org.ies.tierno.readers;

import java.util.ArrayList;
import java.util.Set;
import java.util.Random;

import org.ies.tierno.modules.Department;
import org.ies.tierno.modules.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;

@ExtendWith(MockitoExtension.class)
public class TestMockingReaders {

    @Mock
    private Random random;

    @InjectMocks
    private EmployeeReader employeeReader;
    private DepartmentReader departmentReader;
    private CompanyReader companyReader;

    @Test
    public void testEmployeeRR () {
        when(random.nextInt(10000000, 99999999)).thenReturn(12345678);
        when(random.nextInt(anyInt())).thenReturn(0).thenReturn(2).thenReturn(1);

        Employee testemployee = employeeReader.read();
        Assertions.assertEquals("12345678X", testemployee.getNif());
        Assertions.assertEquals("Alberto", testemployee.getName());
        Assertions.assertEquals("Caine", testemployee.getSurname());
        Assertions.assertEquals("Programador", testemployee.getPosition());
    }

    @Test
    public void testDepartmentRR () {
        when(random.nextInt(1,10)).thenReturn(3);


        when(random.nextInt(10000000, 99999999)).thenReturn(12345678).thenReturn(23456789).thenReturn(32109786);
        when(random.nextInt(anyInt())).thenReturn(0).thenReturn(2).thenReturn(1);
        when(random.nextInt(anyInt())).thenReturn(2).thenReturn(0).thenReturn(2);
        when(random.nextInt(anyInt())).thenReturn(3).thenReturn(4).thenReturn(0);

        Department testDepartment = departmentReader.read();
        Assertions.assertEquals("Departamento", testDepartment.getName());

        Set<Employee> testEmployees = new Set<>();
        testEmployees.addAll(testDepartment.getEmployees());
        testEmployees.stream().sorted();

        Assertions.assertEquals("12345678X", testEmployees[0].getNif());
        Assertions.assertEquals("Alberto", testemployee.getName());
        Assertions.assertEquals("Caine", testemployee.getSurname());
        Assertions.assertEquals("Programador", testemployee.getPosition());
    }
}
