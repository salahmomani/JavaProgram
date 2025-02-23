package part6.objectsonalist.MessagingService;

import java.util.ArrayList;

public class MessagingService {
    String sender;
    String content;
    ArrayList <MessagingService> Messages;
    public void MessagingService(){
        this.content="none";
        this.sender="none";
        this.Messages= new ArrayList<>();

    }
    public void add(MessagingService message){
        Messages.add(message);
    }
    public ArrayList<MessagingService> getMessages(){
return  this.Messages;
    }
}
