package dynamicProgramming.leetcode;

import myBinTree.MaxHeap;

public class Lcr103 {
    public static void main(String[] args) {

    }
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount ; j++) {
                if(dp[j - coins [i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j],dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
