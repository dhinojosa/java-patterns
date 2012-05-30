package org.abqjug.javapatterns.proxy;

/**
 * @author John Ericksen
 */
public class LoggingProxy implements Target {

    private Target proxied;

    public LoggingProxy(Target proxied) {
        this.proxied = proxied;
    }

    public void callMe() {
        long start = before("callMe()");
        proxied.callMe();
        after("callMe()", start);
    }

    public void takeSomeTime() {
        long start = before("takeSomeTime()");
        proxied.takeSomeTime();
        after("takeSomeTime()", start);
    }

    private long before(String name) {
        System.out.println("Before " + name);
        return System.currentTimeMillis();
    }

    private void after(String name, long start) {
        System.out.println("After: " + name + " took: " + (System.currentTimeMillis() - start));
    }
}
