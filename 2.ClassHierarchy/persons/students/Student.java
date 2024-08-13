package persons.students;
import persons.Gender;
import persons.Person;

public class Student extends Person {
    protected int studentId;
    protected String major;
    
    public Student(String name, short age, Gender gender, int studentId, String major) {
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
}
