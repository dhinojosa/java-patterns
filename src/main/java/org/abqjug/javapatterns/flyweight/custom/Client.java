package org.abqjug.javapatterns.flyweight.custom;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 10:16 AM
 */
public class Client {
    public static void main(String[] args) {
        StarWarsActionFigureFactory factory = new StarWarsActionFigureFactory();
        StarWarsActionFigure starWarsActionFigure  = factory.getInstance("Han Solo");
        StarWarsActionFigure starWarsActionFigure2 = factory.getInstance("Han Solo");
        assert starWarsActionFigure.equals(starWarsActionFigure2);
        assert starWarsActionFigure == starWarsActionFigure2;
    }
}
