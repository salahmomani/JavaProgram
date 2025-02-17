package part8.Shortrecap.liquidcontainers;

public class LiquidContainers {
    int first;
    int second;

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
    public void addfirst(int number)
    {
        if(this.first+number<=100 && number>0)
        {
            this.first+=number;
        }
        else  if(this.first+number>=100) {
            this.first = 100;
        }

    }

    public void movetosecond(int number)
    {
        if(this.first-number<=0 && number>0)
        {
            this.second+=this.first;
            this.first=0;

        }
        else if(this.first-number>0 && number>0)
        {
            this.first-=number;
            this.second+=number;
        }
    }
    public void remove(int number)
    {
        if(this.second>0 && number>0)
        {
            this.second-=number;
        }
        else if(this.second-number<0 && number>0)
        {
            this.second=0;
        }
    }
}
