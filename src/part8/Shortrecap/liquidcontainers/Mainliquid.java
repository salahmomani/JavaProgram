package part8.Shortrecap.liquidcontainers;

import java.util.Scanner;

public class Mainliquid {
    public static void main(String[] args) {

        LiquidContainers l =new LiquidContainers();
        while (true) {
            System.out.println("First: "+l.getFirst()+"/100");
            System.out.println("Second: "+l.getSecond()+"/100");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();

            String command = in.next();
            int number=in.nextInt();
            if (command.equals("add")){
                l.addfirst(number);
            }

            else if(command.equals("move")){
                l.movetosecond(number);
            }

            else if(command.equals("remove")){
                l.remove(number);
            }
            else if (command.equals("quit")) {
                break;

            }
            else{
                System.out.println("invalid command");
            }
        }
    }
}