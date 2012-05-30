package org.abqjug.javapatterns.composite;

/**
 * @author John Ericksen
 */
public class Number extends ArithmeticExpression {

    private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
