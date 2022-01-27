package queue;

public class LoopQueueTest {
    public static void main(String[] args) {
        LoopQueue loopQueue = new LoopQueue(5);
        for (int i = 0; i < 5; i++) {
            loopQueue.offer(i+1);
        }
        System.out.println(loopQueue);
        System.out.println(loopQueue.peek());
        System.out.println(loopQueue.poll());
        System.out.println(loopQueue);
    }
}
