package persons.faculty;

import interfaces.Manageable;
import interfaces.Researchable;
import interfaces.Teachable;
import persons.Gender;

public final class Professor extends Faculty implements Teachable, Researchable, Manageable {
    private boolean tenure;

    public Professor(String name, short age, Gender gender, int facultyId, boolean tenure) {
        super(name, age, gender, facultyId);
        this.tenure = tenure;
    }

    public boolean isTenure() {
        return tenure;
    }

    public void setTenure(boolean tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return
            "Professor " + facultyId + ": " + name +
            "; " +
            (super.gender == Gender.MALE ? "he" : "she") + " " +
            (tenure ? "has" : "has no") + " tenure"
        ;
    }

    @Override
    public void manage() {
        System.out.println("Managing research projects and academic programs.");
    }

    @Override
    public void conductResearch() {
        System.out.println("Conducting research in specialized fields.");
    }

    @Override
    public void teach() {
        System.out.println("Teaching advanced courses.");
    }
}
