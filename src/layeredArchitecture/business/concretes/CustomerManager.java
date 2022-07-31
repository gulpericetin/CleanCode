package layeredArchitecture.business.concretes;

import layeredArchitecture.business.abstracts.CustomerService;
import layeredArchitecture.business.abstracts.PersonService;
import layeredArchitecture.dataAccess.abstracts.CustomerDal;
import layeredArchitecture.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
    CustomerDal customerDal;
    PersonService personService;
    public CustomerManager(CustomerDal customerDal, PersonService personService)
    {
        this.customerDal=customerDal;
        this.personService=personService;
    }
    public void add(Customer customer) throws Exception {


        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        //validateIdentityNumberIfEmpty(customer);
        checkCustomerExists(customer);
        customerDal.add(customer);

    }

    public void addByOtherBusiness(Customer customer) throws Exception {

        validateFirstNameLength(customer);
        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
      //  validateIdentityNumberIfEmpty(customer);
        checkCustomerExists(customer);
        customerDal.add(customer);

    }

    private void validateFirstNameIfEmpty(Customer customer) throws Exception {
        if (customer.getFirstName().equals(null))
            throw new Exception("isim giriniz");
    }

    private void validateLastNameIfEmpty(Customer customer) throws Exception {
        if (customer.getLastName().equals(null))
            throw new Exception("soyisim giriniz");
    }



    private void validateFirstNameLength(Customer customer) throws Exception {
        if (customer.getFirstName().length()<2)
            throw new Exception("min iki karakter girilmelidir.");
    }

    private void checkCustomerExists(Customer customer) throws Exception {
        if(customerDal.customerExists(customer)) {
            throw new Exception("müşteri zaten mevcut");
        }
    }
}
