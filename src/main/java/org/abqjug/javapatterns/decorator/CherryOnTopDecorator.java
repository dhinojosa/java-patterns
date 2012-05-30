package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public class CherryOnTopDecorator extends SundayDecorator {
    public CherryOnTopDecorator(Sunday sunday) {
        super(sunday);
    }

    public String describeSunday() {
        return getDecorated().describeSunday() + " with a Cherry on top";
    }
}
