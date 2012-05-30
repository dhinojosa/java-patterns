package org.abqjug.javapatterns.singleton.eager;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:36 PM
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
