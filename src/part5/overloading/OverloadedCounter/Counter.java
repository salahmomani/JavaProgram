package part5.overloading.OverloadedCounter;

public class Counter {
    private int value;

    public Counter(int value) {
        this.value = value;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value-1;
    }

    public int value() {
        return value;
    }
    public void increaseValue(int increaseBy) {
        this.value = this.value + increaseBy;
    }
    public void decreaseValue(int decreaseBy) {
        this.value = this.value - decreaseBy;
    }
}
