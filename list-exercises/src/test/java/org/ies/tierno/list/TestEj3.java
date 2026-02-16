package org.ies.tierno.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestEj3 {
    public List<Integer> TESTLIST1 = List.of(1, 2, 3);
    public List<Integer> TESTLIST0 = new ArrayList<>();

    @Test
    public void testFilled() {
        Assertions.assertEquals(1, Ej3.first(TESTLIST1));
    }
    @Test
    public void testEmpty() {
        Assertions.assertNull(Ej3.first(TESTLIST0));
    }
}
