package thread;

import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    Semaphore fooSemaphore = new Semaphore(1);
    Semaphore barSemaphore = new Semaphore(0);
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            // p操作，获取到fooSemaphore
            fooSemaphore.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            // v操作,释放barSemaphore
            barSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barSemaphore.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooSemaphore.release();
        }
    }
}
