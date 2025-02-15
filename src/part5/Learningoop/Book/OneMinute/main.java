package part5.Learningoop.Book.OneMinute;
public class main {
    public static void main(String[] args) throws InterruptedException {
        timer t = new timer();
        while (true) {
            System.out.println(t);
            t.advance();
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }}

