package part7.Algorithms.searching;

import java.util.ArrayList;

public class binary {

    public binary(ArrayList<Book> bookss, int i) {
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int start = 0;
        int end = books.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            Book currentBook = books.get(mid);
            int currentId = currentBook.getId();

            if (currentId == searchedId) {
                return mid;
            } else if (currentId < searchedId) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }



}
