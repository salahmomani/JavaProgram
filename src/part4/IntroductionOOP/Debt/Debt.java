package part4.IntroductionOOP.Debt;

public class Debt {

double balance;
double interestRate;
public Debt(double initialBalance, double initialInterestRate)
{
    balance=initialBalance;
    interestRate=initialInterestRate;
}
    public void printBalance(){
        System.out.println(balance);
    }
    public void waitOneYear(){
balance=balance*interestRate;    }
}
