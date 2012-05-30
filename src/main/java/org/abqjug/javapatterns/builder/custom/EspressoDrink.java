package org.abqjug.javapatterns.builder.custom;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:58 PM
 */
public class EspressoDrink {
    private int shots;
    private boolean skimMilk;
    private boolean sprinkles;
    private boolean decaf;
    private boolean whip;

    protected EspressoDrink(EspressoDrinkBuilder espressoDrinkBuilder) {
        this.shots = espressoDrinkBuilder.getShots();
        this.skimMilk = espressoDrinkBuilder.isSkimMilk();
        this.sprinkles = espressoDrinkBuilder.isSprinkles();
        this.decaf = espressoDrinkBuilder.isDecaf();
        this.whip = espressoDrinkBuilder.isWhip();
    }
}
