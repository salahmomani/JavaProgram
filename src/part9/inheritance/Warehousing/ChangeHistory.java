package part9.inheritance.Warehousing;

import java.util.ArrayList;

public class ChangeHistory {
    double maxvalue=0;
    double minvalue=0;
    int counter=0;
    ArrayList<Double> history;

    public ChangeHistory(){
        ChangeHistory changeistory =new ChangeHistory();
    }
    public void add(double status)
    {
        history.add(status);
        counter++;
    }
    public void clear(){
        history.clear();
    }
    public double maxValue(){
        for (double max:history)
        {
            if(max>=maxvalue)
            {
                maxvalue=max;
            }
        }
        return  maxvalue;
    }

    public double minValue(){
        for (double min:history)
        {
            if(min>=minvalue)
            {
                minvalue=min;
            }
        }
        return  minvalue;
    }
    public double average() {
        if (history.isEmpty()) {
            return 0;
        } else {
            return 1.0 * history.size() / counter;
        }
    }
    @Override
    public String toString() {
        return "ChangeHistory{" +
                "history=" + history +
                '}';
    }
}
