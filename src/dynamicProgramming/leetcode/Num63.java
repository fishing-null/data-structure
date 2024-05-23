package dynamicProgramming.leetcode;

public class Num63 {
    public static void main(String[] args) {

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //通过行数和列数构造动态数组
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        //对动态数组初始化
        //首行初始化
        for(int i = 0 ;i < n;i++){
            if(obstacleGrid[0][i] == 1){
                dp[0][i] = 0;
            }else{
                dp[0][i] = 1;
            }
        }
        //首列初始化
        for(int i = 0 ;i < m;i++){
            if(obstacleGrid[i][0] == 1){
                dp[i][0] = 0;
            }else{
                dp[i][0] = 1;
            }
        }
        //递推公式
        for(int i = 0 ;i < m;i++){
            for(int j = 0;j < n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
