package org.abqjug.javapatterns.decorator;

/**
 * @author John Ericksen
 */
public class DecoratorDemonstration {

    public static void main(String[] args) {

        Sundae sundae = new NutsSundaeDecorator(
                new FudgeSundaeDecorator(
                        new WhipcreamSundaeDecorator(
                                new VanillaIceCream()
                        )
                )
        );

        System.out.println(sundae.describeSundae());

        //add a cherry

        sundae = new CherryOnTopDecorator(sundae);

        System.out.println(sundae.describeSundae());
    }
}
