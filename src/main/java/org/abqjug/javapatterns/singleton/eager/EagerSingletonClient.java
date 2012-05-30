package org.abqjug.javapatterns.singleton.eager;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:37 PM
 */
public class EagerSingletonClient {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        assert eagerSingleton == eagerSingleton2;
    }
}
