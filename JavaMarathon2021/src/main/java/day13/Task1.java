package day13;

import javax.swing.plaf.TableHeaderUI;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        User user1 = new User("Kirill");
        User user2 = new User("Danil");
        User user3 = new User("Polina");

        user1.sendMessage(user2,"Hello, my dear friend, how are you?");
        user2.sendMessage(user1, "Hi, i'm fine and you?");
        user1.sendMessage(user2, "Good, сan we go to the cinema today?");
        user2.sendMessage(user1, "I don't mind, which movie?");
        user1.sendMessage(user2, "a new part of the Avengers has been released");
        user2.sendMessage(user2,"Great, meet me at the cinema");

        user3.sendMessage(user1, "Hey, what are you doing tonight?");
        user1.sendMessage(user3, "Hi, I'm going to the cinema with Danil, you can come with us if you want");

        MessageDatabase.showDialog(user1, user2);


    }
}
