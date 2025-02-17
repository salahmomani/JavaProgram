package part8.Shortrecap.dolist;

public class mainlist {
    public static void main(String[] args) {
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        list.remove(2);
        list.print();
        list.add("buy rasins");
        list.print();
        list.remove(1);
        list.remove(1);
        list.print();
    }
}
