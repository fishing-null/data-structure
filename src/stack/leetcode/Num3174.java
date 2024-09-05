package stack.leetcode;

import java.util.Stack;

public class Num3174 {
    public static void main(String[] args) {

    }
    public String clearDigits(String s) {
        //用栈来存储字符串S中的字符
        Stack<Character> stack = new Stack<>();
        //碰到字母入栈,数字则直接弹出栈顶的元素
        for (int i = 0; i < s.length(); i++) {
            if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                stack.push(s.charAt(i));
            }else {
                //当前位置为数字字符
                stack.pop();
            }
        }
        //出栈,拼接字符串
        StringBuilder sb = new StringBuilder();
        while (stack.size() > 0) {
            sb.append(stack.pop());
        }
        //反转字符串并返回
        return sb.reverse().toString();
    }
}
