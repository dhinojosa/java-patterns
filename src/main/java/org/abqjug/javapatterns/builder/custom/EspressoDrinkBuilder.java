package org.abqjug.javapatterns.builder.custom;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:47 PM
 */
public class EspressoDrinkBuilder {

    private boolean decaf;
    private boolean whip;
    private boolean sprinkles;
    private boolean skimMilk;
    private int shots;

    public EspressoDrinkBuilder(int shots) {
        this.shots = shots;
    }

    public EspressoDrinkBuilder addWhip() {
        this.whip = true;
        return this;
    }

    public EspressoDrinkBuilder addSprinkles() {
        this.sprinkles = true;
        return this;
    }

    public EspressoDrinkBuilder addSkimMilk() {
        this.skimMilk = true;
        return this;
    }

    public EspressoDrinkBuilder setDecaf() {
        this.decaf = true;
        return this;
    }
    
    public EspressoDrink build() {
        return new EspressoDrink(this);
    }

    public boolean isDecaf() {
        return decaf;
    }

    public boolean isWhip() {
        return whip;
    }

    public boolean isSprinkles() {
        return sprinkles;
    }

    public boolean isSkimMilk() {
        return skimMilk;
    }

    public int getShots() {
        return shots;
    }
}
