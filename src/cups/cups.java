package cups;

import java.util.Scanner;

public class cups {
    public static void main(String[] args) {
 int intValue;
        String stringValue;
        while (true){
            Scanner in=new Scanner(System.in);

            stringValue=in.next();
if(stringValue == "end"){
    System.out.println("end");
    break;}
intValue=Integer.parseInt(stringValue);
            System.out.println(intValue*intValue*intValue);
        }
    }
}
