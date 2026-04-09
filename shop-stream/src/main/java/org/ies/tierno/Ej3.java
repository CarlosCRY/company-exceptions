package org.ies.tierno;

import org.ies.tierno.models.Student;

import java.util.List;

public class Ej3 {
    public static List<String> mapToEmails(List<Student> students) {
        return students.stream()
                       .map(email -> email.getEmail())
                       .toList();
    }
}
