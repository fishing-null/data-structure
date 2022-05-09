package queue;

public class MyArrayBlockingQueue {
    private long[] array;
    private int frontIndex;
    private int rearIndex;
    private int size;
    public MyArrayBlockingQueue(int capacity){
        array = new long[capacity];
        frontIndex = 0;
        rearIndex = 0;
        size = 0;
    }
    public synchronized void put(long e) throws InterruptedException {
        //判断队列是否满了
        while(array.length == size){
            //TODO
            this.wait();

        }
        array[rearIndex] = e;
        rearIndex++;
        if(rearIndex == array.length){
            rearIndex = 0;
        }
        size++;
        notify();
    }
    public synchronized long take() throws InterruptedException {
        while(size == 0){
            //TODO
            wait();
        }
        long e = array[frontIndex];
        frontIndex++;
        if(frontIndex == array.length){
            frontIndex = 0;
        }
        size--;
        notify();
        return e;
    }
}
