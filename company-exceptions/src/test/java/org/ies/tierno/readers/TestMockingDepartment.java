package org.ies.tierno.readers;

import org.ies.tierno.modules.Department;
import org.ies.tierno.modules.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;
import java.util.Set;

import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestMockingDepartment {

    @Mock
    private Random random;

    @Mock
    private Reader<Employee> employeeReader;

    @InjectMocks
    private DepartmentReader departmentMocker;

    @Test
    public void testDepartmentRR () {
        when(random.nextInt(1,10)).thenReturn(3);

        Employee emp1 = new Employee("12345678X", "Alberto", "Caine", "Programador");
        Employee emp2 = new Employee("23456789X", "Carlota", "Baal", "Representante");
        Employee emp3 = new Employee("32109786X", "Dario", "Aleph", "Jefe departamento");

        when(employeeReader.read()).thenReturn(emp1).thenReturn(emp2).thenReturn(emp3);

        Department testDepartment = departmentMocker.read();
        Assertions.assertEquals("Departamento", testDepartment.getName());

        Assertions.assertEquals(Set.of(emp1, emp2, emp3), testDepartment.getEmployees());
    }
}
