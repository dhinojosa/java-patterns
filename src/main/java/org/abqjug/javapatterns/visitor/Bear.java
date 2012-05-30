package org.abqjug.javapatterns.visitor;

/**
 * @author John Ericksen
 */
public class Bear implements Animal {

    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public void feed(Meat meat) {
        System.out.println("Yum, I love meat");
    }
}
