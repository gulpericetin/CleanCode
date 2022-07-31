package layeredArchitecture.dataAccess.abstracts;

import layeredArchitecture.entities.concretes.Customer;

public interface CustomerDal {
    void add(Customer customer);
    boolean customerExists(Customer customer);
}
