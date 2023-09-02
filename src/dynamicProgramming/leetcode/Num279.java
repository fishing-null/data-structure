package dynamicProgramming.leetcode;

public class Num279 {
    public static void main(String[] args) {
        Num279 num279 = new Num279();
        num279.numSquares(13);
    }
    //
    public int numSquares(int n) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[n + 1];
        int len = dp.length;
        for (int i = 0; i < len; i++) {
            dp[i] = max;
        }
        dp[0] = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i*i; j <= n; j++) {
                if(dp[j - i*i] != max){
                    dp[j] = Math.min(dp[j],dp[j - i * i] + 1);
                }
            }
        }
        return dp[n];
    }
}
