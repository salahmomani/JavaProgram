package part7.Algorithms;

import java.util.Arrays;

public class sorting {

    public class Sorting {

        public static int indexOfSmallestFrom(int[] table, int startIndex) {
            int sm = table[startIndex];
            int index=startIndex;

            for (int i = startIndex; i < table.length; i++){
                if (table[i] < sm) {
                    sm = table[i];
                    index = i;
                }
            }
            return index;
        }
        public static void swap(int[] array, int index1, int index2) {
            int tmp = array[index1];
            array[index1] = array[index2];
            array[index2] = tmp; // ✅ Fixed assignment
        }

        public static void sort(int[] array) {
            System.out.println(Arrays.toString(array));

            for (int i= 0 ; i<array.length;i++){
                int smallindex=indexOfSmallestFrom(array,i);
                swap(array,i,smallindex);

                System.out.println(Arrays.toString(array));

            }
}}}
