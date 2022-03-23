package leetCode;

public class Num622 {
    class MyCircularQueue {
        private int head;
        private int tail;
        private int[] circularQueue;
        public MyCircularQueue(int k) {
            this.circularQueue = new int[k+1];
        }

        public boolean enQueue(int value) {
            if(isFull()){
                return false;
            }
            circularQueue [tail] = value;
            tail = (tail+1)%circularQueue.length;
            return true;
        }

        public boolean deQueue() {
            if(isEmpty()){
                return false;
            }
            head = (head+1)%circularQueue.length;
            return true;
        }

        public int Front() {
            if(isEmpty()){
                return -1;
            }
            return circularQueue[head];
        }

        public int Rear() {
            if(isEmpty()){
                return -1;
            }
            int lastIndex = tail==0?circularQueue.length-1:tail-1;
            return circularQueue[lastIndex];
        }

        public boolean isEmpty() {
            return head == tail;
        }

        public boolean isFull() {
            return (tail+1)%circularQueue.length == head;
        }
    }

}
