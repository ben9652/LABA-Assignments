package persons.staff;

import persons.Gender;
import persons.Person;

public class Staff extends Person {
    protected int staffId;
    protected String position;

    public Staff(String name, short age, Gender gender, int staffId, String position) {
        super(name, age, gender);
        this.staffId = staffId;
        this.position = position;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff member " + staffId + ": " + name;
    }
}
