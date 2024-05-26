package dynamicProgramming.leetcode;

public class Num122 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        //dp数组初始化
        int n = prices.length;
        if (n == 1) return 0;
        int[] dp0 = new int[n];
        int[] dp1 = new int[n];
        dp0[0] = 0;
        dp1[0] -= prices[0];
        //状态转移
        for (int i = 1; i < n; i++) {
            dp0[i] = Math.max(dp1[i - 1] + prices[i], dp0[i - 1]);
            dp1[i] = Math.max(dp1[i - 1], dp0[i - 1] - prices[i]);
        }
        //返回值
        return Math.max(dp0[n - 1], dp1[n - 1]);
    }
}
