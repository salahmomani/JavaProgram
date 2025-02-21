package part11.classdiagrams.saveableperson;

public interface Saveable {
    public  void  save();
    public  void  delete();
    public  void  load(String address);
}
