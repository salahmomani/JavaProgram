package part12.Randomness.LotteryRow;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);

    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random random = new Random();

        while (this.numbers.size() < 7) {
            int newNumber = random.nextInt(40) + 1;
            if (!containsNumber(newNumber)) {
                this.numbers.add(newNumber);
            }
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryRow)) {
            return false;
        }
        LotteryRow otherRow = (LotteryRow) other;
        return this.numbers.equals(otherRow.numbers);    }
}
