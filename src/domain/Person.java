package domain;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    protected String id;

    protected Person() {
    }

    @Override
    public String toString() {
        return "domain.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
