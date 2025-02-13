package part2.Methods;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=greatest(2,7,10);
        System.out.println(ans);

    }
    public static int greatest(int number1, int number2, int number3) {
        int great;
        if(number1<number2 && number3<number2)
        {
            great=number2;
        }
        else if(number1>number2 && number3<number1)
        {
            great=number1;
        }
        else{great=number3;}
        return great;
    }
}
