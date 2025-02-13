package part2.Moreloops;

import java.util.Scanner;

public class Repeatingandremembering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int sum=0;
 int count=0;
 double avg;
 int oddcount=0;
 int evencount=0;
    System.out.println("Give numbers:");
      while(true)
           {
                int num=in.nextInt();
              if(num==-1){break;}
              if(num%2==0){evencount++;}
              else{oddcount++;}
              sum+=num;
           count++;
           }
      avg=1.0*sum/count;
        System.out.println("Thx! Bye!" );
        System.out.println("Sum: "+sum);
        System.out.println("number: "+count);
        System.out.println("average: "+avg);
        System.out.println("even: "+evencount);
        System.out.println("odd: "+oddcount);
    }
}
