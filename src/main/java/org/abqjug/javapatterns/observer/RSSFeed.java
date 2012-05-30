package org.abqjug.javapatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author John Ericksen
 */
public class RSSFeed {

    private List<RSSObserver> observers = new ArrayList<RSSObserver>();

    public void broadcast(RSSEntry entry) {
        for (RSSObserver observer : observers) {
            observer.update(entry);
        }
    }

    public RSSObserver addObserver(RSSObserver observer) {
        observers.add(observer);
        return observer;
    }

    public void removeObserver(RSSObserver observer) {
        observers.remove(observer);
    }
}
