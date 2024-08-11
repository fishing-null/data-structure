package binary;

import java.util.Stack;

public class BM44 {
    public static void main(String[] args) {
        BM44 bm44 = new BM44();
        bm44.isValid("[])");
    }
    public boolean isValid (String s) {
        // write code here
        //遇到左括号入栈,右括号检查是否匹配 匹配则出栈
        Stack<Character> stack = new Stack<Character>();
        char[] arr = s.toCharArray();
        if(arr == null || arr.length == 1) return false;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '{' || arr[i] == '[' || arr[i] == '(') stack.push(arr[i]);
            else if(arr[i] == '}' || arr[i] == ']' || arr[i] == ')'){
                if(stack.isEmpty()) return false;
                //匹配具体括号类型
                if(arr[i] == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if (arr[i] == ')' && stack.peek() == '(') {
                    stack.pop();
                }else if(arr[i] == ']' && stack.peek() == '['){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
