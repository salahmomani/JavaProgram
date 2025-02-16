package part6.Stack;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;
    public  Stack(){
        stacks=new ArrayList<>();
    }

    public boolean isEmpty(){
return stacks.isEmpty();
    }
    public void add(String value){
        stacks.add(value);
    }
    public ArrayList<String> values(){
return  this.stacks;
    }
    public String take(){
        return stacks.getLast();
    }
}
