package part2.Repeatingfunctionality;

import java.util.Scanner;

public class Averageofpositivenumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double avg;
    int sum=0;
    int count=0;
         while (true){
    System.out.println("Give a number:");
    int num= in.nextInt();
    if (num==0)
    {break;}
    else if(num>0){
        sum+=num;
        count++;
    }

}
         if(count==0)
         {
             System.out.println("Cannot calculate the average");
         }
         else {
             avg = (double) sum / count;
             System.out.println(avg);
         }
    }
}
