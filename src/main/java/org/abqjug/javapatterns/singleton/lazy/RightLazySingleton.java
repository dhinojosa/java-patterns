package org.abqjug.javapatterns.singleton.lazy;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:33 PM
 */
public class RightLazySingleton {
    private static RightLazySingleton instance = null;

    private RightLazySingleton() {
    }

    public static RightLazySingleton getInstance() {
        if (instance == null) {
            // Only synchronize once (i.e. we don't want to context switch every time getInstance is called!)
            synchronized(RightLazySingleton.class) {
                // Need the 2nd null check in case 1 or more threads were waiting for the lock, while
                // the first thread assigned the instance.  So, if 1 or more threads got past the first
                // null check, they will not get past the 2nd when the first thread releases the lock.
                if (instance == null) {
                    instance = new RightLazySingleton();
                }
            }
        }
        return instance;
    }
}
