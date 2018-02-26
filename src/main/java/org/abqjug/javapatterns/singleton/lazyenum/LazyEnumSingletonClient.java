package org.abqjug.javapatterns.singleton.lazyenum;

/**
 * User: Matt Lagrotte (matt@lagrotte.net)
 * Date: 2/26/18
 * Time: 2:00 PM
 */
public class LazyEnumSingletonClient {
    public static void main(String[] args) {
        LazyEnumSingleton singleton = LazyEnumSingleton.INSTANCE;
        LazyEnumSingleton singleton2 = LazyEnumSingleton.INSTANCE;

        assert singleton == singleton2;
    }
}
