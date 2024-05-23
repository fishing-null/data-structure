package dynamicProgramming.leetcode;

public class Lcr166 {
    public static void main(String[] args) {
        Lcr166 lcr166 = new Lcr166();
        lcr166.jewelleryValue(new int[][] {{1,3,1},{1,5,1},{4,2,1}});
    }
    public int jewelleryValue(int[][] frame) {
        //构造dp数组
        //dp数组行数
        int m = frame.length;
        //dp数组列数
        int n = frame[0].length;
        int[][] dp = new int[m][n];
        //对dp数组进行初始化
        //行初始化
        for(int i = 0;i < n;i++){
            dp[0][i] = frame[0][i];
        }
        for(int i = 1;i < n;i++){
            dp[0][i] += dp[0][i-1];
        }
        //列初始化
        for(int i = 0;i < m;i++){
            dp[i][0] = frame[i][0];
        }
        for(int i = 1;i < m;i++){
            dp[i][0] += dp[i-1][0];
        }
        //递推公式
        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + frame[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
