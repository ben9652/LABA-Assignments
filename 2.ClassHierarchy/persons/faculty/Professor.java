package persons.faculty;

import persons.Gender;

public class Professor extends Faculty {
    private boolean tenure;

    public Professor(String name, short age, Gender gender, int facultyId, boolean tenure) {
        super(name, age, gender, facultyId);
        this.tenure = tenure;
    }

    public boolean isTenure() {
        return tenure;
    }

    public void setTenure(boolean tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return
            "Professor " + facultyId + ": " + name +
            "; " +
            (super.gender == Gender.MALE ? "he" : "she") + " " +
            (tenure ? "has" : "has no") + " tenure"
        ;
    }
}
