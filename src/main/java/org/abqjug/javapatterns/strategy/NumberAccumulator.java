package org.abqjug.javapatterns.strategy;

import java.util.List;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:47 PM
 */
public class NumberAccumulator {
    private AccumulatorStrategy strategy;

    public void setAccumulatorStrategy(AccumulatorStrategy strategy) {
        this.strategy = strategy;
    }

    public Integer accumulate(List<Integer> integers) {
        if (integers.size() == 1) return integers.get(0);
        return strategy.process(integers.get(0),
            accumulate(integers.subList(1, integers.size())));
    }
}
