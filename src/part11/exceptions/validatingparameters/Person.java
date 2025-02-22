package part11.exceptions.validatingparameters;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.trim().isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name: must be non-null, non-empty, and at most 40 characters.");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: must be between 0 and 120.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
