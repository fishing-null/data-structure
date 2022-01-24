package queue;

import java.util.NoSuchElementException;

public class MyQueue<E> implements Queue<E>{
    //创建一个链表储存队列元素
    private class Node{
        E val;
        Node next;
        public Node(E val){
            val = this.val;
        }
    }

    private int size;
    private Node head;
    private Node tail;
    @Override
    public void offer(E val) {
        Node node = new Node(val);
        if(isEmpty()){
            head = node;
        }
        head.next=node;
        size++;
    }

    @Override
    public E poll() {
        if(isEmpty()){
            throw new NoSuchElementException("出队失败,当前队列内没有元素!");
        }
        E val = head.val;
        Node node = head;
        head = head.next;
        node.next = null;
        return val;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            throw new NoSuchElementException("出队失败,当前队列内没有元素!");
        }
        return head.val;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
