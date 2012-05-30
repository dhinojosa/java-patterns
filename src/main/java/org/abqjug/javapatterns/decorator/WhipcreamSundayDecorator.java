package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public class WhipcreamSundayDecorator extends SundayDecorator {
    public WhipcreamSundayDecorator(Sunday sunday) {
        super(sunday);
    }

    public String describeSunday() {
        return "Whipcream " + getDecorated().describeSunday();
    }
}
