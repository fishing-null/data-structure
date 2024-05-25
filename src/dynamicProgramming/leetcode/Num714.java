package dynamicProgramming.leetcode;

public class Num714 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices, int fee) {
        //状态定义
        //dp0[i]第i天持有股票时所能获得的最大利润
        //dp1[i]第i天不持有股票时所能获得的最大利润
        int n = prices.length;
        //处理边界
        if(n == 1) return 0;
        int[] dp0 = new int[n];
        int[] dp1 = new int[n];
        //初始化dp数组
        dp0[0] -= prices[0];
        for(int i = 1;i < n;i++){
            dp0[i] = Math.max(dp0[i-1],dp1[i-1]-prices[i]);
            dp1[i] = Math.max(dp1[i-1],dp0[i-1]+prices[i]-fee);
        }
        return Math.max(dp0[n-1],dp1[n-1]);
    }
}
