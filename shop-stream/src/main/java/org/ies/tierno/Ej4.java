package org.ies.tierno;

import org.ies.tierno.models.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Ej4 {
    public static List<Student> filterByZipCode(List<Student> students, int zipCode) {
        return students.stream()
                       .filter(student -> student.getZipCode() == zipCode)
                       .collect(Collectors.toList());
    }
}
