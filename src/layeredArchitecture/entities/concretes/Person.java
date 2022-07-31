package layeredArchitecture.entities.concretes;

import layeredArchitecture.entities.abstracts.Entity;

public class Person implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String identityNumber;
    private int yearOfBirth;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, String identityNumber, int yearOfBirth) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setIdentityNumber(identityNumber);
        this.setYearOfBirth(yearOfBirth);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
