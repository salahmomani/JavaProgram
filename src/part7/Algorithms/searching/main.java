package part7.Algorithms.searching;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList <Integer>arr=new ArrayList<>();
        ArrayList<Book> bookss = null;
        arr.add(5);
        arr.add(8);
        arr.add(4);
        arr.add(9);
        arr.add(10);
linear l=new linear(bookss, 3);
binary b=new binary(bookss,3);
        System.out.println(b.toString());
        System.out.println(l.toString());

    }
}
