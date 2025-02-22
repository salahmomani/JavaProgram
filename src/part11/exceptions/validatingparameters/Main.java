package part11.exceptions.validatingparameters;

public class Main {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Alice", 25);
            System.out.println("Person created: " + person1.getName() + ", Age: " + person1.getAge());



            Calculator calc = new Calculator();
            System.out.println("Factorial of 5: " + calc.factorial(5));
            System.out.println("Binomial coefficient (5, 3): " + calc.binomialCoefficient(5, 3));


        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
