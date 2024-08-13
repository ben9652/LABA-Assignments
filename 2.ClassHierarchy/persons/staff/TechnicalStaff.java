package persons.staff;

import persons.Person;

public class TechnicalStaff extends Person {
    private String expertise;

    public TechnicalStaff(String name, short age, String expertise) {
        super(name, age);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
