package threads;

public class ThreadNumberPrint implements Runnable{
    Thread t;

    ThreadNumberPrint(){
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if ((i % 20) == 0) {
                System.out.println();
            }
        }
    }

}
