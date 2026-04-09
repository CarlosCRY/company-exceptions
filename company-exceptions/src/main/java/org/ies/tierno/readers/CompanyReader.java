package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.modules.Company;
import org.ies.tierno.modules.Department;

import java.util.HashMap;
import java.util.Random;
import java.util.Map;

@AllArgsConstructor
public class CompanyReader implements Reader<Company> {
    private final static String[] CNAMES ={"Tartaro", "Shinra", "Mishima"};
    private final static String[] CTYPE ={"SA", "Corp", "Zaibatsu"};
    private final Random random;
    private final Reader<Department> departmentReader;

    @Override
    public Company read() {
        Map<String, Department> departments = new HashMap<>();
        for (int i = random.nextInt(1,10); i > 0; i--) {
            Department nDepartment = departmentReader.read();
            nDepartment.setName(nDepartment.getName() + " " + i);
            departments.put(nDepartment.getName(), nDepartment);
        }
        return new Company(
                CNAMES[random.nextInt(CNAMES.length)] + " " + CTYPE[random.nextInt(CTYPE.length)],
                "A" + random.nextInt(10000000, 99999999),
                departments
        );
    }
}
