package part12.Multidimensionaldata.Magicsquare;

import java.util.ArrayList;

public class MagicSquare {
    private int[][] square;
    private int size;

    public MagicSquare(int size) {
        this.size = size;
        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> rowSums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += square[i][j];
            }
            rowSums.add(sum);
        }
        return rowSums;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> colSums = new ArrayList<>();
        for (int j = 0; j < size; j++) {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += square[i][j];
            }
            colSums.add(sum);
        }
        return colSums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> diagSums = new ArrayList<>();
        int mainDiagSum = 0, secDiagSum = 0;
        for (int i = 0; i < size; i++) {
            mainDiagSum += square[i][i];
            secDiagSum += square[i][size - i - 1];
        }
        diagSums.add(mainDiagSum);
        diagSums.add(secDiagSum);
        return diagSums;
    }

    public void generateMagicSquare() {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Only odd-sized magic squares are supported");
        }
        square = new int[size][size];
        int row = 0, col = size / 2;
        for (int num = 1; num <= size * size; num++) {
            square[row][col] = num;
            int nextRow = (row - 1 + size) % size;
            int nextCol = (col + 1) % size;
            if (square[nextRow][nextCol] != 0) {
                row = (row + 1) % size;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }
    }

    public void printSquare() {
        for (int[] row : square) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}
}
