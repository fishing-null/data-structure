package dynamicProgramming.leetcode;

public class Num509 {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        if(n == 0 || n == 1) {
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
