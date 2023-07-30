package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        for (Message mess : messages) {
            if(mess.sender.equals(u1) && mess.receiver.equals(u2)){
                System.out.println(mess.sender.name + ": " + mess.text);
            } else if (mess.sender.equals(u2) && mess.receiver.equals(u1)) {
                System.out.println(mess.sender.name + ": " + mess.text);
            }
        }
    }
}
