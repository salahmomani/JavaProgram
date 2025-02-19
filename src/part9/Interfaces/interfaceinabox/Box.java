package part9.Interfaces.interfaceinabox;

import java.util.ArrayList;

public class Box implements  Packables{
Double maximumCapacityOfYheBox;
    private ArrayList<Packables> items;


    public Box(double maximumCapacityOfYheBox) {
        this.maximumCapacityOfYheBox = maximumCapacityOfYheBox;
        this.items = new ArrayList<>();

    }

    public void add(Packables item) {

        if(this.weight()+item.weight()<maximumCapacityOfYheBox)
        {
            items.add(item);
        }

    }


    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packables item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;




    }
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }


}
