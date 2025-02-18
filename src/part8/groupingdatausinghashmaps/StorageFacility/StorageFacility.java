package part8.groupingdatausinghashmaps.StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
HashMap<String , ArrayList<String>> storageList;

    public void add(String unit, String item){
        this.storageList.putIfAbsent(unit,new ArrayList<>());
        this.storageList.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit){
        for (String s:this.storageList.keySet()){
            if((this.storageList.keySet().contains(storageUnit)))

            {
                return this.storageList.get(storageUnit);
            }
        }
        return null;
    }

    public void remove(String storageUnit, String item){
        if (this.storageList.containsKey(storageUnit)) {
            this.storageList.get(storageUnit).remove(item);

        }    }

    public ArrayList<String> storageUnits(){
        return new ArrayList<>(this.storageList.keySet());
    }
}
