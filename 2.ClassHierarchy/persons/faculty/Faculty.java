package persons.faculty;

import persons.Gender;
import persons.Person;

public class Faculty extends Person {
    protected int facultyId;

    public Faculty(String name, short age, Gender gender, int facultyId) {
        super(name, age, gender);
        this.facultyId = facultyId;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    @Override
    public String toString() {
        return "Faculty " + facultyId + ": " + name;
    }
}
