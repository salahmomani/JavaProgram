package part9.polymorphism.Herds;

public class Organism implements Movable{
    int x;
    int y;
    public Organism(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void move(int x, int y) {
        this.x=this.x+x;
        this.y=this.y+y;
    }

    @Override
    public String toString() {
        return "x: "+this.x+"; y: "+this.y;
    }
}
