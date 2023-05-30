package dynamicProgramming.leetcode;

public class Num70 {
    public static void main(String[] args) {

    }
    public int climbStairs(int n){
        int[] dp = new int[n+1];
        if(n == 1 || n == 2){
            return n;
        }
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
