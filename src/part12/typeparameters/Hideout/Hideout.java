package part12.typeparameters.Hideout;

public class Hideout<T> {
    private T hiddenObject;

    public Hideout() {
        this.hiddenObject = null;
    }
    public void putIntoHideout(T toHide){
        this.hiddenObject=toHide;
    }
    public T takeFromHideout(){
        T take = this.hiddenObject;
        this.hiddenObject = null;
        return take;
    }
    public boolean isInHideout() {
        return this.hiddenObject != null;
    }
}
