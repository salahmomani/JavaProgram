package part12.typeparameters.Pipe;

public class Main {
    public static void main(String[] args) {

        Pipe<String> pipe = new Pipe<>();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        while(pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }
    }
}