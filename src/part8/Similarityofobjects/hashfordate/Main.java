package part8.Similarityofobjects.hashfordate;

public class Main {
    public static void main(String[] args) {

        SimpleDate date1 = new SimpleDate(15, 8, 1947);
        SimpleDate date2 = new SimpleDate(15, 8, 1947);
        SimpleDate date3 = new SimpleDate(26, 1, 1950);

        System.out.println("HashCode for date1: " + date1.hashCode());
        System.out.println("HashCode for date2: " + date2.hashCode());
        System.out.println("HashCode for date3: " + date3.hashCode());

        System.out.println("date1 equals date2: " + date1.equals(date2));
        System.out.println("date1 equals date3: " + date1.equals(date3));
    }
}