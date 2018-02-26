package org.abqjug.javapatterns.singleton.lazylambda;

import com.google.common.base.Supplier;

/**
 * User: Matt Lagrotte (matt@lagrotte.net)
 * Date: 2/26/18
 * Time: 2:00 PM
 */
public class LazyLambdaSingleton {

    private static LazyLambdaSingleton instance = null;

    private static Supplier<LazyLambdaSingleton> singletonSupplier = () ->
    {
        instance = new LazyLambdaSingleton();
        singletonSupplier = () -> instance;
        return instance;
    };

    public static LazyLambdaSingleton getInstance() {
        return singletonSupplier.get();
    }
}