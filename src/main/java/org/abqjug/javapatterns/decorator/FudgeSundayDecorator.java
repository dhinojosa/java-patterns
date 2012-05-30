package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public class FudgeSundayDecorator extends SundayDecorator {
    public FudgeSundayDecorator(Sunday sunday) {
        super(sunday);
    }

    public String describeSunday() {
        return "Fudge " + getDecorated().describeSunday();
    }
}
