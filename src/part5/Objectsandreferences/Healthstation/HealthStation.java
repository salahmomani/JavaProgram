package part5.Objectsandreferences.Healthstation;

public class HealthStation {
    private int weighCount;

    public HealthStation() {
        this.weighCount = 0;
    }

    public int weigh(Person person) {
        this.weighCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.increaseweight();
    }

    public int weighings() {

return this.weighCount;
    }
}
