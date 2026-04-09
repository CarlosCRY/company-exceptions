package org.ies.tierno.modules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;

@Log4j
@Data
@AllArgsConstructor
public class Employee {
    private String nif;
    private String name;
    private String surname;
    private String position;

    public void showInfo () {
        log.info(surname + ", " + name + " (" + nif + "): " + position);
    }
}
