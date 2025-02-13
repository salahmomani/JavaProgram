package part4.IntroductionOOP.Statistics;

public class statistics {
    private int count;
    int number,oddnum,evennum;
//public void setCount(int counter){
//    count=counter;
//}
    public statistics() {
count=0;
    }

    public void addNumber(int number) {
        count++;
      this.number= this.number+number;
      if (number%2==0)
      {
          evennum=evennum+number;
      }
      else
      {
          oddnum=oddnum+number;
      }
    }

    public int getCount() {
return count;
    }
    public int sum() {
return    number;
    }

    public double average() {
return 1.0*this.number/count;    }
    public int oddsum() {
        return    oddnum;
    }
    public int evensum() {
        return    evennum;
    }
}
