package persons.students;

import persons.Gender;

public class Undergraduate extends Student {
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
}
