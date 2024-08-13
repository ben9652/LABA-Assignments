package persons.faculty;

import persons.Person;

public class Faculty extends Person {
    private String facultyId;

    public Faculty(String name, short age, String facultyId) {
        super(name, age);
        this.facultyId = facultyId;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }
}
