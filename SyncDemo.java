class Counter {
    int count = 0;

    // WITHOUT 'synchronized', threads fight over 'count'.
    // WITH 'synchronized', only one thread enters at a time.
    public void increment() { 
        count++; 
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // Thread 1: Increments 1000 times
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });

        // Thread 2: Increments 1000 times
        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });

        t1.start();
        t2.start();

        // Wait for both to finish
        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}