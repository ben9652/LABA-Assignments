package persons.faculty;

import persons.Person;

public class Professor extends Person {
    private boolean tenure;

    public Professor(String name, short age, boolean tenure) {
        super(name, age);
        this.tenure = tenure;
    }

    public boolean isTenure() {
        return tenure;
    }

    public void setTenure(boolean tenure) {
        this.tenure = tenure;
    }
}
