package part9.inheritance.ABC;

public class MainABC {
    public static void main(String[] args) {


        A a = new A();
        B b = new B();
        C c = new C();
        a.printA();
        b.printB();
        c.printC();

        C c2 = new C();

        c.printA();
        c.printB();
        c.printC();
    }
}
