package persons.faculty;

import persons.Person;

public class AdjunctProfessor extends Person {
    private int contractLength;

    public AdjunctProfessor(String name, short age, int contractLength) {
        super(name, age);
        this.contractLength = contractLength;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }
}
