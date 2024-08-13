package persons.students;
import persons.Person;

public class Student extends Person {
    protected int studentId;
    protected String major;
    
    public Student(String name, short age, int studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    public int getId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }
}
