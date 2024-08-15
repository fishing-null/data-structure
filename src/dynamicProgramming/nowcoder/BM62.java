package dynamicProgramming.nowcoder;

public class BM62 {
    public static void main(String[] args) {

    }
    public int Fibonacci (int n) {
        // write code here
        if(n == 1 || n == 2) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
