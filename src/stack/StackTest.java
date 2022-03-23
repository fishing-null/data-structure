package stack;

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        stack.peek();
        System.out.println(stack);
    }
}
