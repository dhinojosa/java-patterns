package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public class SundayMaker {

    public static void main(String[] args) {

        Sunday sunday = new NutsSundayDecorator(
                new FudgeSundayDecorator(
                        new WhipcreamSundayDecorator(
                                new VanillaIceCream()
                        )
                )
        );

        System.out.println(sunday.describeSunday());
    }
}
