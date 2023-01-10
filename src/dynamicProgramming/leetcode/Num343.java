package dynamicProgramming.leetcode;

public class Num343 {
    public static void main(String[] args) {
        integerBreak(4);
    }
    public static int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < n+1; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                max = Math.max(max,Math.max(j*(i-j),j*dp[i-j]));
            }
            dp[i] = max;
        }
        return dp[n];
    }
}
