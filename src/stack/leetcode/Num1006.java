package stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Num1006 {
    public static void main(String[] args) {

    }
    public int clumsy(int n) {
        int index = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(n);
        n--;
        while(n > 0){
            if(index % 4 == 0){
                deque.push(deque.pop()*n);
            }else if(index % 4 == 1){
                deque.push(deque.pop()/n);
            }else if(index % 4 == 2){
                deque.push(n);
            }else {
                deque.push(-n);
            }
            index++;
            n--;
        }
        int sum = 0;
        while (!deque.isEmpty()){
            sum += deque.pop();
        }
        return sum;
    }
}
