package part5.Objectsandreferences.Biggestpetshop;


public class Main {
    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
    }
}