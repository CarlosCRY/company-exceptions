package org.ies.tierno.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestEj13 {
    public List<Double> TESTLIST1 = List.of(1.1, 2.1, 1.2);
    public List<Double> TESTLIST2 = List.of(1.3, 3.1, 1.2);

    @Test
    public void test1() {
        Assertions.assertEquals(List.of(1.1, 2.1), Ej13.removeAll(TESTLIST1, TESTLIST2));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(List.of(1.3, 3.1), Ej13.removeAll(TESTLIST2, TESTLIST1));
    }
}
