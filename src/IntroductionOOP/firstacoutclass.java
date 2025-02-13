package IntroductionOOP;

public class firstacoutclass {
    public  String acountname;
    public double balance;
   public firstacoutclass(String name,double bala)
   {
       acountname=name;
       balance=bala;
   }
   public void deposit(double dep)
   {
       balance= balance+dep;
   }
   public  void withdraw(double with)
   {
       balance= balance-with;
   }
}
