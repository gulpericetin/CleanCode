package workingWithMethods;

import workingWithMethods.Customer;

public class CustomerManager {
       /*public void add(String firstName, String lastName, String identityNumber, int cityId){
            System.out.println("Eklendi"); kirli kod  }*/
  /*  public void add(Customer customer){
        System.out.println(customer.getFirstName() + " Eklendi");

       /* code smell technical debt
       if (String.IsNullOrEmpty(customer.getFirstName())&& String.IsNullOrEmpty(customer.getLastName())&&
                String.IsNullOrEmpty(customer.getIdentityName())){
            System.out.println(customer.getFirstName() + " Eklendi");
        }*/

    public void add(Customer customer) throws Exception {
        //technical debt --> teknik borçlanma kodu ilerde düzelticez
        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        validateIdentityNumberIfEmpty(customer);

        CustomerDal customerDal = new CustomerDal() {
            @Override
            public boolean customerExists(Customer customer) {
                return false;
            }
        };
        checkCustomerExist(customer);
        customerDal.add(customer);
    }

    public void addByOtherBusiness(Customer customer) throws Exception {
        validateFirstNameIfEmpty(customer);
        validateLastNameIfEmpty(customer);
        validateIdentityNumberIfEmpty(customer);
        validateFirstNameLength(customer);

        CustomerDal customerDal = new CustomerDal() {
            @Override
            public boolean customerExists(Customer customer) {
                return false;
            }
        };
        checkCustomerExist(customer);
        customerDal.add(customer);

    }

    //Metot içerisinde çok fazla parametre gönderimine örnek kötü bir kod
    public void add2(int id,String firstName,String lastName,String nationalIdentity){
        System.out.println("Eklendi");
    }

    private void validateFirstNameIfEmpty(Customer customer) throws Exception {
        if ((customer.getFirstName().trim().isEmpty())){
            throw new Exception("First name cannot be empty");
        }
    }

    private void validateLastNameIfEmpty(Customer customer) throws Exception {
        if (((customer.getLastName().trim().isEmpty()))){
            throw new Exception("Last name cannot be empty");
        }
    }

    private void validateIdentityNumberIfEmpty(Customer customer) throws Exception {
        if ((customer.getIdentityNumber().trim().isEmpty())){
            throw new Exception("IdendtityNumber cannot be empty");
        }
    }
    private void validateFirstNameLength(Customer customer) throws Exception {
        if ((customer.getFirstName().length() <= 2)){
            throw new Exception("First name must be at least two characters");
        }
    }
    private void checkCustomerExist(Customer customer){
        CustomerDal customerDal = new CustomerDal() {
            @Override
            public boolean customerExists(Customer customer) {
                return false;
            }
        };
        if (customerDal.customerExist(customer)){
            System.out.println("Customer is already exist");
        }
    }
}
