package part9.polymorphism.Herds;

import java.util.ArrayList;

public class Herd implements  Movable{
ArrayList<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public void addToHerd(Movable movable)
    {
herds.add(movable);
    }

    public void move(int dx, int dy){
        for (Movable member : herds) {
            member.move(dx, dy);
        }
    }


    @Override
    public String toString() {
               String text=" ";
               for (Movable m:herds)
               {
                   text+=m.toString()+"\n";
               }
               return text;

    }
}
