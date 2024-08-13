package persons.staff;

import persons.Person;

public class MaintenanceStaff extends Person {
    private String shift;

    public MaintenanceStaff(String name, short age, String shift) {
        super(name, age);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
