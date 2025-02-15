package part5.Fitbyte;

public class Fitbyte {
    int age;
    int HRmax;
    int HRrest;
    public Fitbyte(int age, int restingHeartRate)
    {
        this.age=age;
                this.HRrest=HRrest;
    }

    public double targetHeartRate(double percentageOfMaximum){
        return ((HRmax - (this.HRrest*age)) * (percentageOfMaximum/100)+ HRrest );

    }
}
