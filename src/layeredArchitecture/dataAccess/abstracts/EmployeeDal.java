package layeredArchitecture.dataAccess.abstracts;

import layeredArchitecture.entities.concretes.Employee;

import java.util.List;

public interface EmployeeDal {
    List<Employee> getAll();
}
