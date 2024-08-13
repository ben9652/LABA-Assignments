package persons.staff;

import persons.Gender;

public class TechnicalStaff extends Staff {
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
}
