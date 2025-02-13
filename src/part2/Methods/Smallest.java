package part2.Methods;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=smallest(2,7);
        System.out.println(ans);
    }

    public static int smallest(int number1, int number2) {
        int small;
        if(number1>number2)
        {
            small=number2;
        }
        else{small=number1;}
        return small;
    }
}
