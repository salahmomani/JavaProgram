package part2.Methods;

import java.util.Scanner;

public class Divisiblebythree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        divisibleByThreeInRange(2,10);
    }

    public static void divisibleByThreeInRange(int beginning, int end)
    {
        for (int i=beginning;i<=end;i++)
        {
            if(i%3==0)
            {
                System.out.println(i);
            }
        }
    }
}
