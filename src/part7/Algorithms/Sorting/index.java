package part7.Algorithms.Sorting;

public class index {

    public static int indexOfSmallest(int[] table, int startIndex) {
        int sm = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < sm) {
                sm = table[i];
                index = i;
            }
        }
        return index;
    }

}