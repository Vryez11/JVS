package thread.start.test;

import static java.lang.Thread.sleep;
import static util.MyLogger.log;

public class StartTest4Main {

    public static void main(String[] args) {
        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log("A");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable runnableB = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    log("A");
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        threadA.start();
        threadB.start();
    }
}
