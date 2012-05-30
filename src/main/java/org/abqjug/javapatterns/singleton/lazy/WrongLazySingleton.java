package org.abqjug.javapatterns.singleton.lazy;

public class WrongLazySingleton {
    private static WrongLazySingleton instance = null;

    private WrongLazySingleton() { }

    public static WrongLazySingleton getInstance() {
        if (instance == null) {
            instance = new WrongLazySingleton();
        }
        return instance;
    }
}
