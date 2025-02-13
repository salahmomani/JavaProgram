package part4.IntroductionOOP.Gauge;

public class Gauge {
    private int value;

    public Gauge(){
        value=0;
    }
    public void increase(){
        value+=1;
    }
    public void decrease(){
        value-=1;
    }
    public int value(){
        return value;
    }
    public boolean full(){
        if (value==5)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
}
