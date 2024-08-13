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

    @Override
    public void performDuties() {
        System.out.println("Teach classes, develop curriculum, and participate in academic research.");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + facultyId;
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
        Faculty other = (Faculty) obj;
        if (facultyId != other.facultyId)
            return false;
        return true;
    }
}
