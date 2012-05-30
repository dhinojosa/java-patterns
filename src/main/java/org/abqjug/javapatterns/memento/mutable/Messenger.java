package org.abqjug.javapatterns.memento.mutable;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 11:26 AM
 */
public class Messenger {
    private Message currentMessage;

    public void postNextMessage(Message message) {
        this.currentMessage = message;
    }

    public Message getMemento() {
        return currentMessage.copy();
    }

    public void setMemento(Message message) {
        currentMessage = message.copy();
    }

    public Message getCurrentMessage() {
        return currentMessage;
    }
}
