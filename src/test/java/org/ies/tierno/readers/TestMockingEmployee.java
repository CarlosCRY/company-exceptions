package org.ies.tierno.readers;

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
public class TestMockingEmployee {

    @Mock
    private Random random;

    @InjectMocks
    private EmployeeReader employeeMocker;

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
}
