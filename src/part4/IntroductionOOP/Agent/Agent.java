package part4.IntroductionOOP.Agent;

public class Agent {
    String fname;
    String lname;
    public Agent(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }
    public void print(){
        System.out.println("My name is "+lname+","+fname+" "+lname);
    }
}
