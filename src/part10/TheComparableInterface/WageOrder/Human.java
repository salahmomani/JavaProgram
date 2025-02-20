package part10.TheComparableInterface.WageOrder;

import java.util.Objects;

public class Human implements Comparable<Human>{

    String name;
    int waveInformation;

    public Human(int waveInformation, String name) {
        this.waveInformation = waveInformation;
        this.name = name;
    }

    @Override
    public int compareTo(Human o) {
        return Integer.compare(o.waveInformation, this.waveInformation);

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", waveInformation='" + waveInformation + '\'' +
                '}';
    }
}
