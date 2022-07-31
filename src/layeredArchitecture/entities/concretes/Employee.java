package layeredArchitecture.entities.concretes;

import referanceTypeDemo.Person;

public class Employee extends Person {
    public double salary;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String identityNumber, int yearOfBirth, double salary) {
        super(id, firstName, lastName, identityNumber, yearOfBirth);
        this.salary = salary;
    }
}
