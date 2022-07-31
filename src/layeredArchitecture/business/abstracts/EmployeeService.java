package layeredArchitecture.business.abstracts;

import layeredArchitecture.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();
}
