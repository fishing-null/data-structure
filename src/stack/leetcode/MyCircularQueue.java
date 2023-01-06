package stack.leetcode;

public class MyCircularQueue {
    private int[] elementData;
    private int front;
    private int rear;
    public MyCircularQueue(int k) {
        elementData = new int[k+1];
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        elementData[rear] = value;
        rear = (rear+1) %elementData.length;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%elementData.length;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return elementData[front];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        int index = (rear-1+elementData.length)%elementData.length;
        return elementData[index];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear+1) % elementData.length == front;
    }
}
