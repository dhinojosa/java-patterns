package org.abqjug.javapatterns.memento.immutable;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:00 PM
 */
public class Messenger {

    private Message currentMessage;

    public Messenger(Message message) {
        this.currentMessage = message;
    }

    public Messenger() {}

    public Messenger postNextMessage(Message message) {
        return new Messenger(message);
    }

    public Message getCurrentMessage() {
        return currentMessage;
    }
}
