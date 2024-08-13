package persons.faculty;

import persons.Person;

public class AssistantProfessor extends Person {
    private String supervisor;

    public AssistantProfessor(String name, short age, String supervisor) {
        super(name, age);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
