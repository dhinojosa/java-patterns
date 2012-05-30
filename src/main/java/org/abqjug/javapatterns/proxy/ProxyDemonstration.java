package org.abqjug.javapatterns.proxy;

/**
 * @author John Ericksen
 */
public class ProxyDemonstration {

    public static void main(String[] args) {

        Target target = new TargetImpl();

        target.callMe();
        target.takeSomeTime();

        System.out.println("Added Proxy");
        target = new LoggingProxy(target);

        target.callMe();
        target.takeSomeTime();
    }
}
