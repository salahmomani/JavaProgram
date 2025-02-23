package part6.objectsonalist.Cargohold;

import java.util.ArrayList;

public class Suitcase {
int currentweight;
    int maxweight;
ArrayList<Item> items;
public  Suitcase(int maxweight ){
this.currentweight=0;
this.maxweight=maxweight;
items=new ArrayList<>();

}
    public void addItem(Item item){
    items.add(item);
    currentweight+=item.getWeight();
    }

    @Override
    public String toString() {
    int size;
    size=items.size();
if(size==0)
{

    return "no item"+currentweight;
}
else {
    if (size==1)
    {
        return size+" item"+currentweight;
    }
    else
        return size+" items"+currentweight;
}
    }
}
