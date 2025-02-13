package part2.Repeatingfunctionality;

import java.util.Scanner;

public class Numberandsumofnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int sum=0;
    int count=0;
         while (true){
    System.out.println("Give a number:");
    int num= in.nextInt();
    if (num==0)
    {break;}
    else{
        sum+=num;
        count++;
    }

}
        System.out.println("Number of numbers: :  "+count);

        System.out.println("Sum of the numbers:  "+sum);
    }
}
