package org.abqjug.javapatterns.flyweight.custom;

import java.util.HashMap;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 10:10 AM
 */
public class StarWarsActionFigureFactory {
    private HashMap<String, StarWarsActionFigure> flyweights;

    public StarWarsActionFigureFactory() {
        this.flyweights = new HashMap<String, StarWarsActionFigure>();
    }

    public StarWarsActionFigure getInstance(String name) {
         if (flyweights.containsKey(name)) return flyweights.get(name);
         else {
             StarWarsActionFigure starWarsActionFigure = new StarWarsActionFigure(name);
             flyweights.put(name, starWarsActionFigure);
             return starWarsActionFigure;
         }
    }
}
