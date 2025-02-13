package part3.strings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter username:");
        String name=in.nextLine();
        System.out.print("Enter password:");
        String pass=in.nextLine();
if(name.equals("alex"))
{
    if (pass.equals("sunshine"))
    {
        System.out.println("You have successfully logged in!");
    }
    else {
        System.out.println("Incorrect username or password!");
    }
}
else if(name.equals("emma"))
{
    if (pass.equals("haskell"))
    {
        System.out.println("You have successfully logged in!");
    }
    else {
        System.out.println("Incorrect username or password!");
    }
}
else {
    System.out.println("user not found");
}

    }
}
