package layeredArchitecture.dataAccess.concretes.entityFramework;

import workingWithMethods.Customer;
import workingWithMethods.CustomerDal;

public class CustomerDalEF extends CustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("Entity Framework kullanarak veritabanına eklendi.");
    }

    @Override
    public boolean customerExists(Customer customer) {
        return true;
    }

}
