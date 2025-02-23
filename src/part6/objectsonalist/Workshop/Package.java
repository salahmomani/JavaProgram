package part6.objectsonalist.Workshop;

import java.util.ArrayList;

public class Package {
    ArrayList<Gift> gifts = new ArrayList<>();
    public void addGift(Gift gift){
        gifts.add(gift);
    }

    public int totalWeight() {
        int total=0;
        for (Gift g:gifts){total+=g.weight;}
        return total;

    }
}
