package leetCode;


import java.util.LinkedList;
import java.util.Queue;

public class Num225 {
    class MyStack {
        private Queue<Integer> q1;
        private Queue<Integer> q2;
        public MyStack() {
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        public void push(int x) {
            q1.offer(x);
            while(!q2.isEmpty()){
                q1.offer(q2.poll());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int pop() {
            return q2.poll();
        }

        public int top() {
            return q2.peek();
        }

        public boolean empty() {
            return q2.isEmpty();
        }
    }
}
