package org.ies.tierno.list.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private String surname;
    private String email;
    private int zipCode;
}