package part12.Multidimensionaldata.Magicsquare;


public class Main {

    public static void main(String[] args) {
        MagicSquare magicSquare = new MagicSquare(5);
        magicSquare.generateMagicSquare();
        magicSquare.printSquare();
        System.out.println("Row sums: " + magicSquare.sumsOfRows());
        System.out.println("Column sums: " + magicSquare.sumsOfColumns());
        System.out.println("Diagonal sums: " + magicSquare.sumsOfDiagonals());

    }
}
