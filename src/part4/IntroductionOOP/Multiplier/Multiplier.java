package part4.IntroductionOOP.Multiplier;

public class Multiplier {
    int number;
    public Multiplier(int number){
        this.number=number;
    }
    public int multiply(int number)
    {
        number= this.number*number;
        return number;
    }
}
