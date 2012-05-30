package org.abqjug.javapatterns.strategy;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:51 PM
 */
public interface AccumulatorStrategy {
    public Integer process(Integer a, Integer b);
}
