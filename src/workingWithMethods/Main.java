package workingWithMethods;

import workingWithMethods.Customer;
import workingWithMethods.CustomerManager;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer1=new Customer();
        customer1.setFirstName("Gülperi");
        customer1.setLastName("Çetin");
        customer1.setIdentityNumber("345546666544");
        CustomerManager customerManager = new CustomerManager();
        System.out.println(customer1.getFirstName());
        customerManager.add2(1,"Nisa","Çetin","1234567");
        customerManager.addByOtherBusiness(new Customer(1,"Nafiye","çetin","2345677"));


    }

}
