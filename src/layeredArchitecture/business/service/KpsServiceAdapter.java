package layeredArchitecture.business.service;

import layeredArchitecture.business.abstracts.PersonService;
import layeredArchitecture.entities.concretes.Person;
import mernis.Customer;
import mernis.KpsService;

public class KpsServiceAdapter implements PersonService {

    @Override
    public boolean checkPerson(Person person) throws Exception {
        KpsService kpsService =new KpsService();
        return kpsService.checkPerson(person.getIdentityNumber(), person.getFirstName(), person.getLastName());
    }
}
