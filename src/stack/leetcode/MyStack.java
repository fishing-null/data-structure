package stack.leetcode;

import java.util.*;

public class MyStack {
    public Queue<Integer> List1;
    public Queue<Integer> List2;
    public MyStack() {
        List1 = new LinkedList<>();
        List2 = new LinkedList<>();
    }

    public void push(int x) {
        List1.offer(x);
        while (!List2.isEmpty()){
            List1.offer(List2.poll());
        }
        Queue<Integer> tmp = List1;
        List1 = List2;
        List2 = tmp;
    }

    public int pop() {
        return List2.poll();
    }

    public int top() {
        return List2.peek();
    }

    public boolean empty() {
        return List2.isEmpty();
    }
}
