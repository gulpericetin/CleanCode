package referanceTypeDemo;

import referanceTypeDemo.Person;

public class Visitor extends Person {
    private String visitorCard;

    public Visitor() {
    }

    public Visitor(int id, String firstName, String lastName, String visitorCard) {
        super(id, firstName, lastName);
        this.setVisitorCard(visitorCard);
    }

    public String getVisitorCard() {
        return visitorCard;
    }

    public void setVisitorCard(String visitorCard) {
        this.visitorCard = visitorCard;
    }
}
