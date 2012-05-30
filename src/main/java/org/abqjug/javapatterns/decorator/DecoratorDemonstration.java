package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public class DecoratorDemonstration {

    public static void main(String[] args) {

        Sunday sunday = new NutsSundayDecorator(
                new FudgeSundayDecorator(
                        new WhipcreamSundayDecorator(
                                new VanillaIceCream()
                        )
                )
        );

        System.out.println(sunday.describeSunday());

        //add a cherry

        sunday = new CherryOnTopDecorator(sunday);

        System.out.println(sunday.describeSunday());
    }
}
