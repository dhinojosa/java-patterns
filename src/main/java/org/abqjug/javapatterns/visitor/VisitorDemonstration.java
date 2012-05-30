package org.abqjug.javapatterns.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author John Ericksen
 */
public class VisitorDemonstration {

    public static void main(String[] args) {
        new VisitorDemonstration().runZoo();
    }

    public void runZoo() {

        List<Animal> zoo = buildZoo();

        System.out.println("Animals:");

        for (Animal animal : zoo) {
            animal.accept(new AnimalNameVisitor());
        }

        System.out.println("Feeding Time!");

        for (Animal animal : zoo) {
            animal.accept(new AnimalFeederVisitor());
        }
    }

    private List<Animal> buildZoo() {
        List<Animal> zoo = new ArrayList<Animal>();

        zoo.add(new Lion());
        zoo.add(new Bear());
        zoo.add(new Elephant());
        zoo.add(new Zebra());

        Collections.shuffle(zoo);

        return zoo;
    }
}
