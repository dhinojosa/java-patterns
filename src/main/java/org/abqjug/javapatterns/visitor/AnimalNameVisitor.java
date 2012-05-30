package org.abqjug.javapatterns.visitor;

/**
 * @author John Ericksen
 */
public class AnimalNameVisitor implements AnimalVisitor {
    public void visit(Lion lion) {
        System.out.println("Lion");
    }

    public void visit(Elephant elephant) {
        System.out.println("Elephant");
    }

    public void visit(Zebra zebra) {
        System.out.println("Zebra");
    }

    public void visit(Bear bear) {
        System.out.println("Bear");
    }
}
