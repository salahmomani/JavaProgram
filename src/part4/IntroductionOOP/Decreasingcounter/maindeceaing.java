package part4.IntroductionOOP.Decreasingcounter;

public class maindeceaing {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrement();
        counter.printValue();
        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
