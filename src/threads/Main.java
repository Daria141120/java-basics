package threads;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        // task 1
        threadsPrintNumbers(10);
        //sleep чтобы в выводе на консоль задания не перемешивались, т.к. task 1 долго выполняется
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // task 2
        printStateThread("myThread");

        // task 3
        int countResult = counter(100);
        System.out.println(countResult);     // 100_000

        // task 4
        namePrint();

    }

    public static void threadsPrintNumbers(int quantityThreads) {
        ThreadNumberPrint[] threads = new ThreadNumberPrint[quantityThreads];
        for (int i = 0; i < quantityThreads; i++) {
            threads[i] = new ThreadNumberPrint();
        }
    }

    public static void printStateThread(String nameThread) {
        Thread thread = new Thread(nameThread) {
            @Override
            public void run() {
                System.out.println(getName() + " - " + getState());
            }
        };

        System.out.println(thread.getName() + " - " + thread.getState());

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(thread.getName() + " - " + thread.getState());
    }

    public static int counter(int size) {
        CountDownLatch latch = new CountDownLatch(size);
        Counter counter = new Counter();
        ThreadCounter[] threads = new ThreadCounter[size];

        for (int i = 0; i < size; i++) {
            threads[i] = new ThreadCounter(counter, latch);
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return counter.getCount();
    }


    public static void namePrint() {
        ThreadNamePrint objThreadNamePrint1 = new ThreadNamePrint("Thread#1");
        ThreadNamePrint objThreadNamePrint2 = new ThreadNamePrint("Thread#2");
        objThreadNamePrint1.start();
        objThreadNamePrint2.start();

        //sleep чтобы Thread#1 и Thread#2 успели вывести свои имена до того как главный поток их остановит в stopAllMyThreads()
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        ThreadNamePrint.stopAllMyThreads();
    }
}
