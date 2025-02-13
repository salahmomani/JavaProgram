package part4.IntroductionOOP.Decreasingcounter;
/// /////////////three part/////////////////
public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }


    public void decrement() {
        value--;
        if (value < 0) {
            value = 0;
        }
    }
        public void printValue() {
            System.out.println("value: " + this.value);
        }
public void reset(){
        value=0;
}

}
