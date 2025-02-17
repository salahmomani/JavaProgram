package part8.HashMap.Ioweyou;

import java.util.HashMap;

public class IOU {

HashMap<String,Double> hashList=new HashMap<>();
    public IOU(){
        this.hashList=new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
hashList.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        for (String s:hashList.keySet())
        {
            if(s.equals(toWhom)){
                return hashList.get(s);
            }
        }
        return 0.0;
    }
}
