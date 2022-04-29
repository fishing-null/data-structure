package stack.nowcoder;

import java.util.Stack;

public class CM46 {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if(n % 2 != 0){
            return false;
        }
        Stack<Character> s1 = new Stack();
        for(char i:A.toCharArray()){
            if(i == '('){
                s1.push('(');
            }
            else if(i == ')'){
                if(s1.isEmpty()){
                    return false;
                }
                else if(s1.peek() == '('){
                    s1.pop();
                }
            }else{
                return false;
            }
        }
        return s1.isEmpty();
    }
}
