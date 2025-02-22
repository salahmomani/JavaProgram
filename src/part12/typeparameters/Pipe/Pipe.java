package part12.typeparameters.Pipe;

import java.util.ArrayList;

public class Pipe <T>{
    private ArrayList<T> elements;
    public Pipe() {
        this.elements = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.elements.add(value);
    }

    public T takeFromPipe() {
        if (this.elements.isEmpty()) {
            return null;
        }
        return this.elements.remove(0);
    }

    public boolean isInPipe() {
        return !this.elements.isEmpty();

    }

}
