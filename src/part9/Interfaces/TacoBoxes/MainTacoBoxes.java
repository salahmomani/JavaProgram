package part9.Interfaces.TacoBoxes;

public class MainTacoBoxes {
    public static void main(String[] args) {



        TacoBoxes TB=new TripleTacoBox(4);
        TB.eat();
        System.out.println(TB.tacosRemaining());

        TB=new CustomTacoBox(4);
        TB.eat();
        System.out.println(TB.tacosRemaining());
    }
}
