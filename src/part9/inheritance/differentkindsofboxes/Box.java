package part9.inheritance.differentkindsofboxes;
import java.util.ArrayList;

public abstract class Box {

    public Box(int capacity) {
    }

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}