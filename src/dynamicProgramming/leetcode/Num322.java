package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Num322 {
    public static void main(String[] args) {
        Num322 num322 = new Num322();
        int[] coins = new int[] {1,2,5};
        num322.coinChange(coins,11);

    }
    public int coinChange(int[] coins, int amount) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount+1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = max;
        }
        dp[0] = 0;
        for (int i = 1; i <= amount; i++){
            for (int j = 0; j < coins.length; j++) {
                if(i - coins[j] >= 0 && dp[i-coins[j]] != max){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]] + 1);
                }
            }
        }
        return dp[amount] == max ? -1 :dp[amount];
    }
}
