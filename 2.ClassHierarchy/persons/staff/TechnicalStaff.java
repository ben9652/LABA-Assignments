package persons.staff;

import interfaces.Manageable;
import interfaces.Supportable;
import persons.Gender;

public final class TechnicalStaff extends Staff implements Supportable, Manageable {
    private String expertise;

    public TechnicalStaff(String name, short age, Gender gender, int staffId, String position, String expertise) {
        super(name, age, gender, staffId, position);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return
            "Technical staff member " + staffId + ": " + name +
            "; " +
            (super.gender == Gender.MALE ? "his expertise is " : "her expertise is ") +
            expertise
        ;
    }

    @Override
    public void manage() {
        System.out.println("Managing IT infrastructure and technical teams.");
    }

    @Override
    public void provideSupport() {
        System.out.println("Providing technical support for IT systems.");
    }
}
