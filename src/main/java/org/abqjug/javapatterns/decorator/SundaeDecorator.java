package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public abstract class SundaeDecorator implements Sundae {

    private Sundae decorated;

    public SundaeDecorator(Sundae decorated) {
        this.decorated = decorated;
    }

    public Sundae getDecorated() {
        return decorated;
    }
}
