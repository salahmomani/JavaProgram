package part9.Interfaces.TacoBoxes;

public class CustomTacoBox implements  TacoBoxes{

    private int tacos=5;
//
//    public void setTacos(int tacos) {
//        this.tacos = tacos;
//    }

    public CustomTacoBox(int tacos) {
        if(this.tacos<=0)
        {
            this.tacos=0;
        }
        else {this.tacos=tacos;}
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if(this.tacos>0)
        {
            this.tacos--;
        }
        else {this.tacos=0;}

    }
}
