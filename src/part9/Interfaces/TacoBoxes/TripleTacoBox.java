package part9.Interfaces.TacoBoxes;

public class TripleTacoBox  implements TacoBoxes{
private int tacos;

    public TripleTacoBox(int tacos) {
        this.tacos = tacos;
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
