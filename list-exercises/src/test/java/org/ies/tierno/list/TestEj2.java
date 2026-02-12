package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEj2 {
    public List<String> TESTLIST = List.of("Biggs", "Halligan", "Alberich", "Haze");

    @Test
    public void test1Input() {
        Ej2.addAtBeggining(TESTLIST, "Pig");

        Assertions.assertEquals("Pig", TESTLIST.get(0));
        Assertions.assertEquals(5, TESTLIST.size());
    }
}
