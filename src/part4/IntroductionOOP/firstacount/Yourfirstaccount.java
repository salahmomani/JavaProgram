package part4.IntroductionOOP.firstacount;

import java.util.Scanner;

public class Yourfirstaccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        firstacoutclass artosAccount = new firstacoutclass("Arto's account", 100.00);
        firstacoutclass artosSwissAccount = new firstacoutclass("Arto's account in Switzerland", 1000000.00);
        firstacoutclass Matthewsaccount = new firstacoutclass("Matthews account in Switzerland", 1000.00);
        firstacoutclass Myaccount = new firstacoutclass("Myaccount in Switzerland", 0);

        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);

        artosAccount.withdraw(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance);
        artosSwissAccount.deposit(200);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance);
Matthewsaccount.withdraw(100);
Myaccount.deposit(100);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance);
        System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance);
        System.out.println("The balance Matthewsaccount is now: " + Matthewsaccount.balance);
        System.out.println("The balance of Myaccount is now: " + Myaccount.balance);

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
        System.out.println(Myaccount);
        System.out.println(Matthewsaccount);
    }
}
