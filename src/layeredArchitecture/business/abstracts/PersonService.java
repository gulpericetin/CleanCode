package layeredArchitecture.business.abstracts;

import layeredArchitecture.entities.concretes.Person;

public interface PersonService {
    boolean checkPerson(Person person) throws Exception;
}
