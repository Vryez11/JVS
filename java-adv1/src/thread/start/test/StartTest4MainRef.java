package thread.start.test;

import static java.lang.Thread.sleep;
import static util.MyLogger.log;

public class StartTest4MainRef {

    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A", 1000), "Thread-A");
        Thread threadB = new Thread(new PrintWork("B", 500), "Thread-B");
        threadA.start();
        threadB.start();
    }

    static class PrintWork implements Runnable {
        private String content;
        private int sleepMs;

        public PrintWork(String content, int timeMs) {
            this.content = content;
            this.sleepMs = timeMs;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                try {
                    sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
