package dynamicProgramming.nowcoder;

public class BM67 {
    public static void main(String[] args) {
        
    }
    public int uniquePaths (int m, int n) {
        // write code here
        int[][] dp = new int[m][n];
        //数组初始化
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        //递推公式
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
