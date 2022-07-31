package mernis;

public class KpsServiceAdapter implements PersonService{
    @Override
    public boolean checkPerson(Customer person) {
        KpsService kpsService =new KpsService();
        return kpsService.checkPerson(person.getIdentityNumber(), person.getFirstName(), person.getLastName());
    }
}
