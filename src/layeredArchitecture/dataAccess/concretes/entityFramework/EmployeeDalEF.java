package layeredArchitecture.dataAccess.concretes.entityFramework;

import layeredArchitecture.dataAccess.abstracts.EmployeeDal;
import layeredArchitecture.entities.concretes.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDalEF implements EmployeeDal {
    @Override
    public List<Employee> getAll() {
        return new ArrayList<>();
    }
}
