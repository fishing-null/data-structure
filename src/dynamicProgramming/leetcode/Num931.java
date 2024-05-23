package dynamicProgramming.leetcode;

public class Num931 {
    public static void main(String[] args) {

    }
    public int minFallingPathSum(int[][] matrix) {
        //构造dp数组并对其进行初始化
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for(int i = 0;i < n;i++){
            dp[0][i] = matrix[0][i];
        }
        if(n == 1) return matrix[0][0];
        //状态转移
        for(int i = 1;i < n;i++){
            for(int j = 0;j < n;j++){
                if(j == 0){
                    //处理左边界
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j+1]) + matrix[i][j];
                }else if(j == n-1){
                    //处理右边界
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]) + matrix[i][j];
                }else {
                    //正常情况
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i-1][j+1]) + matrix[i][j];
                }
            }
        }
        //找最小值
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(dp[n-1][i] < min){
                min = dp[n-1][i];
            }
        }
        return min;
    }
}
