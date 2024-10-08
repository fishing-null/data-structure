package dynamicProgramming.nowcoder;

public class BM64 {
    public static void main(String[] args) {
        BM64 bm64 = new BM64();
        bm64.minCostClimbingStairs(new int[] {2,5,20});

    }
    public int minCostClimbingStairs (int[] cost) {
        // write code here
        int totalCost = 0;
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
}
