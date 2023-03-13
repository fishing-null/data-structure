package offer;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    private int min;
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        s1.push(x);
        if(s2.isEmpty()){
            s2.push(x);
        }else if(x < s2.peek()){
            s2.push(x);
        }else  if(x >= s2.peek()){
            s2.push(s2.peek());
        }
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}
