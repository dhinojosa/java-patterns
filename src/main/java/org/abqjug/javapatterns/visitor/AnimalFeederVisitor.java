package org.abqjug.javapatterns.visitor;

/**
 * @author John Ericksen
 */
public class AnimalFeederVisitor implements AnimalVisitor {
    public void visit(Lion lion) {
        lion.feed(new Meat());
    }

    public void visit(Elephant elephant) {
        elephant.feed(new Hay());
    }

    public void visit(Zebra zebra) {
        zebra.feed(new Hay());
    }

    public void visit(Bear bear) {
        bear.feed(new Meat());
    }

    @Override
    public void visit(Monkey monkey) {
        monkey.feed(new Banana());
    }
}
