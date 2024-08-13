package persons;

public abstract class Person {
    protected String name;
    protected short age;
    protected Gender gender;

    public Person(String name, short age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
