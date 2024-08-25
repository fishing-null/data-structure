package thread;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class ZeroEvenOdd {
    private int n;
    Semaphore zero = new Semaphore(1);
    Semaphore odd = new Semaphore(0);
    Semaphore even = new Semaphore(0);
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        //这个线程只负责打印0
        for (int i = 1; i <= n; i++) {
            zero.acquire();
            printNumber.accept(0);
            if(i % 2 == 1){
                //同步奇数打印
                odd.release();
            }else {
                //同步偶数打印
                even.release();
            }
        }

    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        //打印偶数
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                even.acquire();
                printNumber.accept(i);
                zero.release();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        //打印奇数
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1){
                odd.acquire();
                printNumber.accept(i);
                zero.release();
            }
        }
    }
}
