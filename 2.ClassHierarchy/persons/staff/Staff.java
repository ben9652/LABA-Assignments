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

    @Override
    public void performDuties() {
        System.out.println("Perform administrative or technical support tasks depending on position.");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + staffId;
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Staff other = (Staff) obj;
        if (staffId != other.staffId)
            return false;
        if (position == null) {
            if (other.position != null)
                return false;
        }
        else if (!position.equals(other.position))
            return false;
        return true;
    }
}
