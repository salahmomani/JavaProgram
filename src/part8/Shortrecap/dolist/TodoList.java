package part8.Shortrecap.dolist;

import java.util.ArrayList;

public class TodoList {
    ArrayList <String> list=new ArrayList<>();
    public TodoList() {
        this.list = new ArrayList<>();

    }
    public  void add(String name){
        list.add(name);
    }
    public  void print(){
        for (String s:list)
        {
            System.out.println(s);
        }
    }
    public  void remove(int indextorerove)
    {
        list.remove(indextorerove);
    }
}
