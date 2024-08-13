package persons;

public abstract class Person {
    protected String name;
    protected short age;

    public Person(String name, short age) {
        this.name = name;
        this.age = age;
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
