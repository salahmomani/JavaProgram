package part2.Methods;

import java.util.Scanner;

public class printRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printRectangle(17,3);
    }
    public static void   printRectangle(int width, int height)
    {
        for (int i=0;i<height;i++)
        {
            for (int j=0;j<width;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }

}
