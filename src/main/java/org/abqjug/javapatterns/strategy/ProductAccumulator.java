package org.abqjug.javapatterns.strategy;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:53 PM
 */
public class ProductAccumulator implements AccumulatorStrategy {
    public Integer process(Integer a, Integer b) {
        return a * b;
    }
}
