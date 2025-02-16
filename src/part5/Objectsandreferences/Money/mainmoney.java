package part5.Objectsandreferences.Money;

public class mainmoney {
    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        Money aa = new Money(10, 0);
        Money bb = new Money(3, 0);
        Money cc = new Money(5, 0);

        System.out.println(aa.lessThan(bb));
        System.out.println(bb.lessThan(cc));



        Money aaa = new Money(10, 0);
        Money bbb = new Money(3, 50);

        Money ccc = a.minus(b);

        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(ccc);

        ccc = ccc.minus(aaa);


        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(ccc);
    }
}
