package persons.staff;

import persons.Person;

public class Staff extends Person {
    private String staffId;
    private String position;

    public Staff(String name, short age, String staffId, String position) {
        super(name, age);
        this.staffId = staffId;
        this.position = position;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
