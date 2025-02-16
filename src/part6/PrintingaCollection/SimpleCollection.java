package part6.PrintingaCollection;


import java.util.ArrayList;
import java.util.List;

public class SimpleCollection {
    private String name;
    private List<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("The collection ").append(name).append(" has ").append(elements.size()).append(" element");
        if (elements.size() > 1) {
            sb.append("s");
        }
        sb.append(":\n");

        for (String element : elements) {
            sb.append(element).append("\n");
        }

        return sb.toString().trim();
    }
}