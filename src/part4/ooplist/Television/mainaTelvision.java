package part4.ooplist.Television;

import java.util.ArrayList;
import java.util.Scanner;

public class mainaTelvision {
    public static void main(String[] args) {


    Scanner in=new Scanner(System.in);
    String name;
    int duration;
    ArrayList<TelevisionProgram> list = new ArrayList<>();
    int max;
    while (true) {
        System.out.print(" name");
        name = in.nextLine();
        if (name.isEmpty()) {
            break;
        }
        System.out.print(" Duration");
        duration = in.nextInt();

        list.add(new TelevisionProgram(name, duration));
    }
        System.out.print("Program's maximum duration?");
    max=in.nextInt();
        for (TelevisionProgram t:list)
        {
            if(t.Duration<=max){
                System.out.println(t.toString());

            }
        }


}
}
