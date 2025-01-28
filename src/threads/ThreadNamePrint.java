package threads;

class ThreadNamePrint extends Thread {
    private static Object lock = new Object();
    private static boolean stopFlag = false;

    public ThreadNamePrint(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (!stopFlag) {
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    static void stopAllMyThreads() {
        stopFlag = true;
        synchronized (lock) {
            lock.notify();
        }
    }

}

