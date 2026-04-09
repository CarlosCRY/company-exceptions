package org.ies.tierno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class Tests {
    private final List<String> LSTEST = List.of("Alberich", "Briggs", "Halligan");
    private final List<Integer> LITEST = List.of(3, 1, 4);
    private final List<Double> LDTEST1 = List.of(3.0d, 1.5d, 4.4d);
    private final List<Double> LDTEST2 = List.of(2.0d, 1.5d, 4.4d);

    @Test
    public void testFirst() {
        Assertions.assertEquals(Optional.of("Alberich"), Methods.first(LSTEST));
    }

    public void testLast() {
        Assertions.assertEquals(Optional.of(4), Methods.last(LITEST));
        Assertions.assertNull(Methods.last(List.of()));

    }


}

