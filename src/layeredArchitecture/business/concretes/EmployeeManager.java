package layeredArchitecture.business.concretes;

import layeredArchitecture.business.abstracts.EmployeeService;
import layeredArchitecture.dataAccess.abstracts.EmployeeDal;
import layeredArchitecture.entities.concretes.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    EmployeeDal EmployeeDal;
    public EmployeeManager(layeredArchitecture.dataAccess.abstracts.EmployeeDal EmployeeDal)
    {
        this.EmployeeDal=EmployeeDal;
    }
    @Override
    public List<Employee> getAll() {
        return EmployeeDal.getAll();
    }
}
