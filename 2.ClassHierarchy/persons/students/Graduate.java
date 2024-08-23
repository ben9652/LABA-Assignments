package persons.students;

import persons.Gender;

public final class Graduate extends Student {
    private String researchTopic;

    public Graduate(String name, short age, Gender gender, int studentId, String major, String researchTopic) {
        super(name, age, gender, studentId, major);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String toString() {
        return
            "Graduate " +
            studentId + ": " +
            name + "; " +
            (super.gender == Gender.MALE ? "he's researching about " : "she's researching about ") +
            researchTopic
        ;
    }
}
