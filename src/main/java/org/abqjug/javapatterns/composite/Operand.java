package org.abqjug.javapatterns.composite;

/**
 * @author John Ericksen
 */
public class Operand extends ArithmeticExpression {

    public enum Operation {
        PLUS("+") {
            @Override
            public double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs) {
                return rhs.calculate() + lhs.calculate();
            }
        },
        MINUS("-") {
            @Override
            public double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs) {
                return rhs.calculate() - lhs.calculate();
            }
        },
        MULTIPLICATION("*") {
            @Override
            public double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs) {
                return rhs.calculate() * lhs.calculate();
            }
        },
        DIVISION("/") {
            @Override
            public double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs) {
                return rhs.calculate() / lhs.calculate();
            }
        };

        private String op;

        private Operation(String op) {
            this.op = op;
        }

        public abstract double calculate(ArithmeticExpression rhs, ArithmeticExpression lhs);

        public String getOp() {
            return op;
        }
    }

    private final ArithmeticExpression rhs;
    private final ArithmeticExpression lhs;
    private Operation operation;

    public Operand(ArithmeticExpression rhs, Operation operation, ArithmeticExpression lhs) {
        this.rhs = rhs;
        this.lhs = lhs;
        this.operation = operation;
    }

    @Override
    public double calculate() {
        return operation.calculate(rhs, lhs);
    }

    @Override
    public String toString() {
        return "( " + rhs.toString() + " " + operation.getOp() + " " + lhs.toString() + " )";
    }
}
