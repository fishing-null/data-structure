package stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Num1614 {
    public static void main(String[] args) {

    }
    public int maxDepth(String s) {
        int max = 0;
        int tmp = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push('(');
                tmp++;
                max = Math.max(max,tmp);
            }else if (s.charAt(i) == ')'){
                stack.pop();
                tmp--;
            }
        }
        return max;
    }
}
