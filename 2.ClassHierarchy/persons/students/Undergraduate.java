package persons.students;

public class Undergraduate extends Student {
    private short year;

    public Undergraduate(String name, short age, int studentId, String major, short year) {
        super(name, age, studentId, major);
        this.year = year;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }
}
