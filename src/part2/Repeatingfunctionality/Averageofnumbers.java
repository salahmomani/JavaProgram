package part2.Repeatingfunctionality;

import java.util.Scanner;

public class Averageofnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int sum=0;
    int count=0;
    double avg;
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
         avg= (double) sum /count;
        System.out.println("Average of the numbers:  "+avg);

    }

}
