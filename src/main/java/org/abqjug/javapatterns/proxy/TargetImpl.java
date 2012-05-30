package org.abqjug.javapatterns.proxy;

/**
 * @author John Ericksen
 */
public class TargetImpl implements Target {

    public void callMe() {
        System.out.println("Called");
    }

    public void takeSomeTime() {
        try {
            Thread.sleep(1000);
            System.out.println("Took some time");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
