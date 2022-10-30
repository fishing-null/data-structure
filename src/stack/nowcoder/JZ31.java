package stack.nowcoder;

import java.util.*;

public class JZ31 {
    public static void main(String[] args) {

    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        if(pushA.length == 0){
            return false;
        }
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            while(!stack.isEmpty() && stack.peek() == popA[index]){
                index++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
