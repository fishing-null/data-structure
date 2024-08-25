package dynamicProgramming.leetcode;



public class Num91 {
    public static void main(String[] args) {
        Num91 num91 = new Num91();
        num91.numDecodings("226");

    }
    public int numDecodings(String s) {
        //首先将s转换为字符数组
        char[] ch = s.toCharArray();
        int[] num = new int[ch.length];
        //把ch遍历到整数数组中
        for (int i = 0; i < ch.length; i++) {
            num[i] = ch[i] - 48;
        }
        if(ch.length == 1){
            return (num[0] <= 9 && num[0] >= 1 ) ? 1 : 0 ;
        }
        //创建dp数组并对其进行初始化,dp[i]表示数组i位置上对应的解码方法有多少种
        int[] dp = new int[s.length()];
        dp[0] = (num[0] <= 9 && num[0] >= 1 ) ? 1 : 0 ;
        //判断dp[1]有多少种解码方式
        if(dp[0] == 1 && num[1] <= 9 && num[1] >=1 ){
            dp[1] += 1;
        }
        dp[1] += ((num[0]*10 + num[1]) >= 10 && (num[0]*10 + num[1]) <= 26) ? 1 : 0;
        //状态转移方程
        for (int i = 2; i < s.length(); i++) {
            if(num[i] <= 9 && num[i] >=1){
                dp[i] += dp[i-1];
            }
            if((num[i-1]*10 + num[i]) <= 26 && (num[i-1]*10 + num[i]) >= 10){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()-1];
    }
}
