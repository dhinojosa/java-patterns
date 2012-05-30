package org.abqjug.javapatterns.composite;

/**
 * @author John Ericksen
 */
public class Calculator {

    public static void main(String[] args) {

        // (4 + 6) * (1 / 2)
        ArithmeticExpression calculation =
                new Operand(
                        new Operand(new Number(4), Operand.Operation.PLUS, new Number(6)),
                        Operand.Operation.MULTIPLICATION,
                        new Operand(new Number(1), Operand.Operation.DIVISION, new Number(2)));

        System.out.println(calculation.toString() + " = " + calculation.calculate());
    }
}
