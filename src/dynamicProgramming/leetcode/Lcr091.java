package dynamicProgramming.leetcode;

public class Lcr091 {
    public static void main(String[] args) {

    }
    public int minCost(int[][] costs) {
        //状态定义
        //dp0[i]表示将第i间房子粉刷成红色所需要的最少成本
        //dp1[i]表示将第i间房子粉刷成蓝色所需要的最少成本
        //dp2[i]表示将第i间房子粉刷成绿色所需要的最少成本
        int length = costs.length;
        int[] dp0 = new int[length];
        int[] dp1 = new int[length];
        int[] dp2 = new int[length];
        //初始化
        dp0[0] = costs[0][0];
        dp1[0] = costs[0][1];
        dp2[0] = costs[0][2];
        //状态转移
        for(int i = 1; i < length;i++){
            dp0[i] = Math.min(dp2[i-1],dp1[i-1]) + costs[i][0];
            dp1[i] = Math.min(dp2[i-1],dp0[i-1]) + costs[i][1];
            dp2[i] = Math.min(dp0[i-1],dp1[i-1]) + costs[i][2];
        }
        //返回值
        return Math.min(Math.min(dp0[length-1],dp1[length-1]),dp2[length-1]);
    }
}
