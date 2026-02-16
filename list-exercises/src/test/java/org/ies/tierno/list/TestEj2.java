package org.ies.tierno.list;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEj2 {

    @Test
    public void test1Input() {
        List<String> testList = new ArrayList<>();
        testList.add("Biggs");
        testList.add("Halligan");
        testList.add("Alberich");
        testList.add("Haze");

        Ej2.addAtBeggining(testList, "Pig");

        Assertions.assertEquals("Pig", testList.get(0));
        Assertions.assertEquals(5, testList.size());
    }
    @Test
    public void test3Input() {
        List<String> testList = new ArrayList<>();
        testList.add("Avatar");
        testList.add("Shamino");
        testList.add("Iolo");
        testList.add("Duprey");

        Ej2.addAtBeggining(testList, "Lord British");
        Ej2.addAtBeggining(testList, "Jana");
        Ej2.addAtBeggining(testList, "Sherry");

        Assertions.assertEquals("Lord British", testList.get(2));
        Assertions.assertEquals(7, testList.size());
    }
}
