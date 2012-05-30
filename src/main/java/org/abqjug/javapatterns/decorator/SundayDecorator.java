package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public abstract class SundayDecorator implements Sunday {

    private Sunday decorated;

    public SundayDecorator(Sunday decorated) {
        this.decorated = decorated;
    }

    public Sunday getDecorated() {
        return decorated;
    }
}
