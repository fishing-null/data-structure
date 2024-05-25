package dynamicProgramming.leetcode;

public class Num309 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        //状态定义
        //dp0表示第i天持有股票时所能获得的最大利润
        //dp1表示第i天不持有股票且不为冻结期时所能获得的最大利润
        //dp2表示第i天不持有股票且为冻结期时所能获得的最大利润
        //状态初始化
        int n = prices.length;
        int[] dp0 = new int[n];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        //处理边界
        if(n == 1 || n == 0) return 0;
        dp0[0] -= prices[0];
        //第一天无法卖出入股票
        dp1[0] = 0;
        dp2[0] = 0;
        //状态转移
        for(int i = 1;i < n ; i++){
            dp0[i] = Math.max(dp0[i-1],dp1[i-1]- prices[i]) ;
            dp1[i] = Math.max(dp1[i-1],dp2[i-1]);
            dp2[i] = dp0[i-1] + prices[i];
        }
        return Math.max(Math.max(dp0[n-1],dp1[n-1]),dp2[n-1]);
    }
}
