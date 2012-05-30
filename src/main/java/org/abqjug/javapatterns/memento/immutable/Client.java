package org.abqjug.javapatterns.memento.immutable;

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
        List<Messenger> caretaker = new ArrayList<Messenger>();

        Messenger messenger = new Messenger();
        caretaker.add(messenger.postNextMessage(new Message(new Date(), "Hello", "Dan")));
        caretaker.add(messenger.postNextMessage(new Message(new Date(), "Hello", "John")));
        caretaker.add(messenger.postNextMessage(new Message(new Date(), "Hello", "Dwight")));

        //rollback?
        assert caretaker.get(0).getCurrentMessage().getReceiver().equals("Dan");
    }
}
