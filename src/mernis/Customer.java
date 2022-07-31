package mernis;

import referanceTypeDemo.Person;

public class Customer extends Person {
    private int cityId;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, int cityId) {
        super(id, firstName, lastName);
        this.setCityId(cityId);
    }


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
