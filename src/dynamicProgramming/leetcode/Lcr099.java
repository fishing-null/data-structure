package dynamicProgramming.leetcode;

public class Lcr099 {
    public static void main(String[] args) {
        Lcr099 lcr099 = new Lcr099();
        lcr099.minPathSum(new int[][] {{1,3,1},{1,5,1},{4,2,1}});

    }
    public int minPathSum(int[][] grid) {
        //构造dp数组
        int m = grid.length;
        int n = grid[0].length;
        //对dp数组初始化
        int[][] dp = new int[m][n];
        for(int i = 0;i < n;i++){
            dp[0][i] = grid[0][i];
        }
        for(int i = 1;i < n;i++){
            dp[0][i] += dp[0][i-1];
        }
        for(int i = 0;i < n;i++){
            dp[i][0] = grid[i][0];
        }
        for(int i = 1;i < m;i++){
            dp[i][0] += dp[i-1][0];
        }
        //递推
        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
