package dynamicProgramming.leetcode;

public class Num279 {
    public static void main(String[] args) {
        Num279 num279 = new Num279();
        num279.numSquares(13);
    }
    //
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i ; j++) {
                minn = Math.min(minn,dp[i-j*j]);
            }
            dp[i] = minn+1;
        }
        return dp[n];
    }
}
