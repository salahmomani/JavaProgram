package part9.inheritance.differentkindsofboxes;

import part9.inheritance.ABC.B;

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity)
    {
        super(capacity);
    }
    private int currentWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void add(Item item) {
        if (currentWeight() + item.getWeight() <= capacity) {
            items.add(item);
        }
    }


    public boolean isInBox(Item item) {
        return items.contains(item);

    }
}
