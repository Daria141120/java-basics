package threads;

import java.util.concurrent.CountDownLatch;

public class ThreadCounter implements Runnable{
        Counter counter;
        Thread t;
        public CountDownLatch latch;

        ThreadCounter(Counter c, CountDownLatch l){
            counter = c;
            latch = l;
            t = new Thread(this);
            t.start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
            latch.countDown();
        }

}
