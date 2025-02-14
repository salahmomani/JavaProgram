package part4.ooplist.Television;

public class TelevisionProgram {
    String name;
    int Duration;
    public TelevisionProgram(String name,int Duration){
        this.Duration=Duration;
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return Duration;
    }

    @Override
    public String toString() {
        return name+","+Duration+" minutes";
    }
}
