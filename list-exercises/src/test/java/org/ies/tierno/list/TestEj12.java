package org.ies.tierno.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestEj12 {
    public List<Double> TESTLIST1 = List.of(1.1, 2.1, 1.2);
    public List<Double> TESTLIST2 = List.of(1.3, 3.1, 1.2);

    @Test
    public void test1() {
        Assertions.assertEquals(List.of(1.2), Ej12.junction(TESTLIST1, TESTLIST2));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(List.of(1.2), Ej12.junction(TESTLIST2, TESTLIST1));
    }
}
