package HashSet;

public class Person {
    String name;
    int age;
    String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String toString() {
        return name + ", " + age + ", " + email;
    }
}
