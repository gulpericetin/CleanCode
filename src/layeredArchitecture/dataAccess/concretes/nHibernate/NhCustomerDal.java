package layeredArchitecture.dataAccess.concretes.nHibernate;

import layeredArchitecture.dataAccess.abstracts.CustomerDal;
import layeredArchitecture.entities.concretes.Customer;

public class NhCustomerDal implements CustomerDal {
    @Override
    public void add(Customer customer) {
        System.out.println("Nhibernate kullanarak veritabanına eklendi.");
    }

    @Override
    public boolean customerExists(Customer customer) {
        return true;
    }
}
