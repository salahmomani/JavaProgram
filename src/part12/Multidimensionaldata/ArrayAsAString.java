package part12.Multidimensionaldata;


public class ArrayAsAString {
    public static String arrayAsString(int[][] array){
        StringBuilder builder = new StringBuilder();

        for (int[] row : array) {
            for (int num : row) {
                builder.append(num);
            }
            builder.append("\n");
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));

    }
}