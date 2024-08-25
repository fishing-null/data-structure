package thread;

import java.util.concurrent.Semaphore;

class H2O {
    Semaphore hSemaphore = new Semaphore(2);
    Semaphore oSemaphore = new Semaphore(0);
    private Object lock = new Object();
    private volatile int count = 0;
    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        synchronized (lock) {
            while (count == 2){
                lock.wait();
            }
            count++;
            releaseHydrogen.run();
            lock.notifyAll();
        }
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        synchronized (lock) {
            while (count != 2){
                lock.wait();
            }
            count = 0;
            releaseOxygen.run();
            lock.notifyAll();
        }
        // releaseOxygen.run() outputs "O". Do not change or remove this line.

    }
}