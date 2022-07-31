package mernis;

public class CustomerManager {
    private CustomerDal customerDal;
    private PersonService personService;

    public CustomerManager(CustomerDal customerDal, PersonService personService) {
        this.customerDal = customerDal;
        this.personService = personService;
    }

    public void add(Customer customer){

        validateFirstNameEmpty(customer);
        validateLastNameEmpty(customer);
        validateIdentityNumberIfEmpty(customer);
        checkPersonExist(customer);
        customerDal.add(customer);
    }

    private void validateFirstNameEmpty(Customer customer){
        if ((customer.getFirstName().trim().isEmpty())){
            System.out.println("First name cannot be empty");
        }
    }
    private void validateLastNameEmpty(Customer customer){
        if ((customer.getLastName().trim().isEmpty())){
            System.out.println("Last name cannot be empty");
        }
    }
    private void validateIdentityNumberIfEmpty(Customer customer) {
        if ((customer.getIdentityNumber().trim().isEmpty())){
            System.out.println("idendtityNumber cannot be empty");
        }
    }
    private void checkPersonExist(Customer person){
        if (!personService.checkPerson(person)){
            System.out.println("Kişi bilgileri hatalı");
        }
    }
}
