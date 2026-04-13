package org.ies.tierno.readers;

import java.util.ArrayList;
import java.util.HashSet;
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

    @Mock
    private Reader<Employee> employeeReader;

    @Mock
    private Reader<Department> departmentReader;

    @InjectMocks
    private EmployeeReader employeeMocker;

    @InjectMocks
    private DepartmentReader departmentMocker;

    @InjectMocks
    private CompanyReader companyMocker;

    @Test
    public void testEmployeeRR () {
        when(random.nextInt(10000000, 99999999)).thenReturn(12345678);
        when(random.nextInt(anyInt())).thenReturn(0).thenReturn(2).thenReturn(1);

        Employee testemployee = employeeMocker.read();
        Assertions.assertEquals("12345678X", testemployee.getNif());
        Assertions.assertEquals("Alberto", testemployee.getName());
        Assertions.assertEquals("Caine", testemployee.getSurname());
        Assertions.assertEquals("Programador", testemployee.getPosition());
    }

    @Test
    public void testDepartmentRR () {
        when(random.nextInt(anyInt(), anyInt())).thenReturn(3);

        Employee emp1 = new Employee("12345678X", "Alberto", "Caine", "Programador");
        Employee emp2 = new Employee("23456789X", "Carlota", "Baal", "Representante");
        Employee emp3 = new Employee("32109786X", "Dario", "Aleph", "Jefe departamento");

        when(employeeReader.read()).thenReturn(emp1).thenReturn(emp2).thenReturn(emp3);

        Department testDepartment = departmentMocker.read();
        Assertions.assertEquals("Departamento", testDepartment.getName());

        Assertions.assertEquals(Set.of(emp1, emp2, emp3), testDepartment.getEmployees());
    }
}
