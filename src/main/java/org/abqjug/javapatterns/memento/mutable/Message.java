package org.abqjug.javapatterns.memento.mutable;

import java.util.Date;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 11:37 AM
 */
public class Message {
    private Date date;
    private String message;
    private String receiver;

    public Message(Date date, String message, String receiver) {
        this.date = date;
        this.message = message;
        this.receiver = receiver;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        if (date != null ? !date.equals(message1.date) : message1.date != null) return false;
        if (message != null ? !message.equals(message1.message) : message1.message != null) return false;
        if (receiver != null ? !receiver.equals(message1.receiver) : message1.receiver != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "date=" + date +
                ", message='" + message + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
    
    public Message copy() {
        return new Message(date, message, receiver);
    }
}
