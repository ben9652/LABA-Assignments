package persons.students;

import interfaces.Learnable;
import persons.Gender;

public final class Undergraduate extends Student implements Learnable {
    private short year;

    public Undergraduate(String name, short age, Gender gender, int studentId, String major, short year) {
        super(name, age, gender, studentId, major);
        this.year = year;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
            "Undergraduate " +
            studentId + ": " +
            name + "; " +
            (super.gender == Gender.MALE ? "he's in year" : "she's in year ") +
            year +
            " of college"
        ;
    }

    @Override
    public void learn() {
        System.out.println("Learning from courses and textbooks.");
    }
}
