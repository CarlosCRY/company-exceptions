package org.ies.tierno;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private final String nif;
    private final String name;
    private final String surname;
    private final int zipCode;
}
