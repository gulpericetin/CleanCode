package layeredArchitecture;

import layeredArchitecture.business.abstracts.EmployeeService;
import layeredArchitecture.business.abstracts.ProductService;
import layeredArchitecture.business.concretes.EmployeeManager;
import layeredArchitecture.business.concretes.ProductManager;
import layeredArchitecture.dataAccess.concretes.entityFramework.EmployeeDalEF;
import layeredArchitecture.dataAccess.concretes.entityFramework.ProductDalEF;

public class Main {
    public static void main(String[] args) {
        EmployeeService EmployeeService=new EmployeeManager(new EmployeeDalEF());
        EmployeeService.getAll();

        ProductService ProductService =new ProductManager(new ProductDalEF());
        ProductService.getAll();
    }
}
