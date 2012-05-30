package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public class NutsSundayDecorator extends SundayDecorator {
    public NutsSundayDecorator(Sunday sunday) {
        super(sunday);
    }

    public String describeSunday() {
        return "Nuts " + getDecorated().describeSunday();
    }
}


