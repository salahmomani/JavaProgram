package part5.Objectsandreferences.Datingapp;
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance()
    {
        this.day+=this.day;
    }
    public void advance(int howManyDays)
    {
    this.day=this.day+howManyDays;
    }
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day,this.month,this.year);
        if(this.day+days<=30)
        {
            this.day+=days;
        }
        else if(this.day+days>30)
        {
            this.day+=days%30;
            this.month+=(int)days/30;
            this.year+=days/360;
        }
        return newDate;
    }

    @Override
    public String toString() {
        return "SimpleDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}