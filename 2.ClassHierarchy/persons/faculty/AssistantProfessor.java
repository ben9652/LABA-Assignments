package persons.faculty;

import persons.Gender;

public final class AssistantProfessor extends Faculty {
    private String supervisor;

    public AssistantProfessor(String name, short age, Gender gender, int facultyId, String supervisor) {
        super(name, age, gender, facultyId);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return
            "Assistant professor " + facultyId + ": " + name +
            "; " +
            (super.gender == Gender.MALE ? "his supervisor is " : "her supervisor is ") +
            supervisor
        ;
    }
}
