package persons.students;

import persons.Person;

public class Graduate extends Person {
    private String researchTopic;

    public Graduate(String name, short age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }
}
