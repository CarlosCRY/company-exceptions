package org.ies.tierno.models;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class User {
    private String nif;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private int age;

}