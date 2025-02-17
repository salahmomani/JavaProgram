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

    public int hashCode(){
        int result = 17; // Start with a non-zero constant
        result = 31 * result + day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

}
