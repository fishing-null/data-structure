package queue;

import java.util.NoSuchElementException;

public class LoopQueue implements Queue<Integer>{
    private Integer[] data;
    //指向当前循环队列的队首元素
    private int head;
    //指向当前循环队列的队尾元素的下一个位置
    private int tail;
    //当前循环队列的元素个数
    private int size;
    public LoopQueue(int n ){
        //n为希望保存的元素个数
        //浪费一个空间判断队列是否已满
        data = new Integer[n+1];
    }
    @Override
    public void offer(Integer val) {
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("queue is full,can not offer new value!");
        }
        data[tail] = val;
        tail = (tail+1)%data.length;
        size++;
    }

    @Override
    public Integer poll() {
        if(isEmpty()){
            throw new NoSuchElementException("queue is empty,can not poll!");
        }
        Integer val = data[head];
        head = (head+1)%data.length;
        size--;
        return val;
    }

    @Override
    public Integer peek() {
        if(isEmpty()){
            throw new NoSuchElementException("queue is empty,can not peek!");
        }
        return data[head];
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }

    public boolean isFull(){
        return (tail + 1)%data.length == head;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("front [");
        int lastIndex = tail == 0 ? data.length-1 : tail-1;
        for (int i = head; i < tail; i++) {
            sb.append(data[i]);
            if(i != lastIndex){
                sb.append(",");
            }
            i = (i+1)%data.length;
        }
        sb.append("]");
        return sb.toString();
    }
}
