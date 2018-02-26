package org.abqjug.javapatterns.singleton.lazylambda;

/**
 * User: Matt Lagrotte (matt@lagrotte.net)
 * Date: 2/26/18
 * Time: 2:00 PM
 */
public class LazyLambdaSingletonClient {
    public static class SingletonRunner implements Runnable {
        private LazyLambdaSingleton instance;

        public LazyLambdaSingleton getInstance() {
            return instance;
        }

        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            instance = LazyLambdaSingleton.getInstance();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }
    
    
    public static void main(String[] args) throws InterruptedException {
      SingletonRunner runner1 = new SingletonRunner();
      SingletonRunner runner2 = new SingletonRunner();
      SingletonRunner runner3 = new SingletonRunner();
      SingletonRunner runner4 = new SingletonRunner();
        
      Thread t1 = new Thread(runner1);
      Thread t2 = new Thread(runner2);
      Thread t3 = new Thread(runner3);
      Thread t4 = new Thread(runner4);

      t1.start();
      t2.start();
      t3.start();
      t4.start();

      t1.join();
      t2.join();
      t3.join();
      t4.join();

      assert runner1.getInstance() == runner2.getInstance();
      assert runner2.getInstance() == runner3.getInstance();
      assert runner3.getInstance() == runner4.getInstance();
      assert runner4.getInstance() == runner1.getInstance();
      assert runner2.getInstance() == runner4.getInstance();
      assert runner3.getInstance() == runner1.getInstance();
    }
}
