package part5.overloading.OverloadedCounter;

public class mainconter {
    public static void main(String[] args) {
        Counter c=new Counter(5);
        c.increase();
        c.increase();
        c.decrease();
        c.increaseValue(5);
        c.decreaseValue(1);
        System.out.println(c.value());
    }
}
