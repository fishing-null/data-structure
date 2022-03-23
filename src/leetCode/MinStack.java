package leetCode;

import java.util.Stack;

public class MinStack {
    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
    public MinStack() {

    }

    public void push(int val) {
        s1.push(val);
        if(s2.isEmpty()){
            s2.push(val);
        }else{
            if(val<s2.peek()){
                s2.push(val);
            }else{
                s2.push(s2.peek());
            }
        }
    }

    public void pop() {
        s1.pop();
        s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}
