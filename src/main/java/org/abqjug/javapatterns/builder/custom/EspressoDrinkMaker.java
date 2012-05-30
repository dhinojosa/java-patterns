package org.abqjug.javapatterns.builder.custom;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 10:40 PM
 */
public class EspressoDrinkMaker {

    public static EspressoDrinkBuilder addShots(int i) {
        return new EspressoDrinkBuilder(i);
    }
}
