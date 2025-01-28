package threads;

public class Counter {
    int count = 0;
    synchronized public void increment() {
        count = count + 1;
    }
    synchronized public int getCount() {
        return count;
    }
}
