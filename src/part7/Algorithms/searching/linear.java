package part7.Algorithms.searching;


import java.util.ArrayList;

public class linear {
    public linear(ArrayList<Book> bookss, int i) {
    }

    public static int linearsearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }
}

