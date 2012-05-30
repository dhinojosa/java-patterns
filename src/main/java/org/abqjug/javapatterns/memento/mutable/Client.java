package org.abqjug.javapatterns.memento.mutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 11:46 AM
 */
public class Client {
    public static void main(String[] args) {
        List<Message> caretaker = new ArrayList<Message>();

        Messenger messenger = new Messenger();
        messenger.postNextMessage(new Message(new Date(), "Hello", "Dan"));
        caretaker.add(messenger.getMemento());

        messenger.postNextMessage(new Message(new Date(), "Hello", "John"));
        caretaker.add(messenger.getMemento());

        messenger.postNextMessage(new Message(new Date(), "Hello", "Dwight"));
        caretaker.add(messenger.getMemento());

        messenger.setMemento(caretaker.get(0)); //rollback all the way
        assert messenger.getCurrentMessage().getReceiver().equals("Dan");

    }
}
