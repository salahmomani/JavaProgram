package part10.TheComparableInterface.WageOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainWageOrder {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(7, "Alice"));
        humans.add(new Human(10, "Bob"));
        humans.add(new Human(8, "Charlie"));
        humans.add(new Human(11, "David"));
        Collections.sort(humans);
        System.out.println("Sorted Humans (by waveInformation length):");
        humans.forEach(System.out::println);
    }
}
