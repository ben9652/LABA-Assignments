package com.example.persons.students;
import com.example.exceptions.InvalidAgeException;
import com.example.persons.Gender;
import com.example.persons.Person;

public class Student extends Person {
    protected int studentId;
    protected String major;
    
    public Student(String name, short age, Gender gender, int studentId, String major) throws InvalidAgeException {
        super(name, age, gender);
        this.studentId = studentId;
        this.major = major;
    }

    public int getId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student " + studentId + ": " + super.name;
    }

    @Override
    public void performDuties() {
        System.out.println("Attend classes, complete assignments, and study for exams.");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
        result = prime * result + ((major == null) ? 0 : major.hashCode());
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
        Student other = (Student) obj;
        if (studentId != other.studentId)
            return false;
        if (major == null) {
            if (other.major != null)
                return false;
        }
        else if (!major.equals(other.major))
            return false;
        return true;
    }
}
