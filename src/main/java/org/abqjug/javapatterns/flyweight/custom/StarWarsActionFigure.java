package org.abqjug.javapatterns.flyweight.custom;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 10:13 AM
 */
public class StarWarsActionFigure {
    private String name;

    protected StarWarsActionFigure(String name) {
        this.name = name;
    }

    public String getName() {return name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StarWarsActionFigure that = (StarWarsActionFigure) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "StarWarsActionFigure{" +
                "name='" + name + '\'' +
                '}';
    }
}
