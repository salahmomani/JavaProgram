package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Secondplusthird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


       int element;
       ArrayList<Integer> list=new ArrayList<>();
        while (true)
        {
            element=in.nextInt();
            if(element==0){break;}
list.add(element);
        }
int sum=list.get(2)+list.get(1);
        System.out.println(sum );

    }
}
