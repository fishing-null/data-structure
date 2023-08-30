package dynamicProgramming.leetcode;

public class Num1049 {
    public static void main(String[] args) {

    }
    public int lastStoneWeightII(int[] stones) {
        int sum = 0,len;
        len = stones.length;
        for(int num:stones){
            sum += num;
        }
        int target = sum/2;
        int[] dp = new int[target+1];
        for (int i = 0; i < len; i++) {
            for (int j = target; j >= stones[i] ; j--) {
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum - 2*dp[target];
    }
}
