package PracticeForStarter.Day12.Day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDartabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }


}
