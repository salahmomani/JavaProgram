package part8.Similarityofobjects.hashfordate;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
    public boolean equals(SimpleDate Sd){
        if (this == Sd) return true;
        if (Sd == null || getClass() != Sd.getClass()) return false;
        SimpleDate that = (SimpleDate) Sd;
        return day == that.day && month == that.month && year == that.year;

    }

//    public int hashCode(){
//
//    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

}
