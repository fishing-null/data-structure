package Leetcode;

import java.util.Stack;

public class Num232 {
    class MyQueue {
        private Stack<Integer> s1;
        private Stack<Integer> s2;
        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            //若s2栈为空,则直接返回s2栈底元素(s2栈底元素为队列队首元素)
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        public int peek() {
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }
}
