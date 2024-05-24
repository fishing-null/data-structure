package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Num174 {
    public static void main(String[] args) {
        Num174 num174 = new Num174();

        System.out.println(num174.calculateMinimumHP(new int[][] {{3,-20,30},{-3,4,0}}));
    }
    public int calculateMinimumHP(int[][] dungeon) {
        //定义dp数组,并对其进行初始化
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m+1][n+1];
        //初始化
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[m][n-1] = dp[m-1][n] = 1;
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                int minn = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(minn - dungeon[i][j], 1);
            }
        }
        //返回值
        return dp[0][0];
    }

}
