package leetCode;

import java.util.Stack;

public class Num20 {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            if(charS == '{' || charS == '[' || charS == '('){
                s1.push(charS);
            }else{
                if(s1.isEmpty()){
                    return false;
                }
                char top = s1.pop();
                if(top == '{' && charS !='}'){
                    return false;
                }
                if(top == '[' && charS != ']'){
                    return false;
                }
                if(top == '(' && charS != ')'){
                    return false;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
}
