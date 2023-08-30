package dynamicProgramming.leetcode;

public class Num474 {
    public static void main(String[] args) {

    }
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int oneNum,zeroNum;
        for(String s:strs){
            oneNum = 0;
            zeroNum = 0;
            for(char ch:s.toCharArray()){
                if(ch == '0'){
                    zeroNum++;
                }else {
                    oneNum++;
                }
            }
            for (int i = m; i >= zeroNum ; i--) {
                for (int j = n; j >= oneNum ; j--) {
                    dp[i][j] = Math.max(dp[i][j],dp[i - zeroNum][j - oneNum]+1);
                }
            }
        }
        return dp[m][n];
    }
}
