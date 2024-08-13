package persons.staff;

import persons.Person;

public class AdministrativeStaff extends Person {
    private String officeNumber;

    public AdministrativeStaff(String name, short age, String officeNumber) {
        super(name, age);
        this.officeNumber = officeNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
