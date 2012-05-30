package org.abqjug.javapatterns.observer;

/**
 * @author John Ericksen
 */
public interface RSSObserver {

    void update(RSSEntry entry);
}
