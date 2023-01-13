package stack.nowcoder;

import java.util.Stack;

public class JZ31 {
    public static void main(String[] args) {

    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0){
            return false;
        }
        int index = 0;
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i< pushA.length;i++){
            s.push(pushA[i]);
            while(!s.isEmpty() && s.peek() == popA[index]){
                s.pop();
                index++;
            }
        }
        return s.isEmpty();
    }
}
