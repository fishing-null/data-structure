package dynamicProgramming.leetcode;

public class Num494 {
    public static void main(String[] args) {
        Num494 num494 = new Num494();
        num494.findTargetSumWays(new int[] {100},-200);

    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        int diff = sum - target;
        int left = (sum + target)/2;
        if(diff < 0 || diff % 2 != 0 || left < 0){
            return 0;
        }
        int[] dp = new int[left + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = left; j >= nums[i] ; j--) {
                dp[j] = dp[j] + dp[j - nums[i]];
            }
        }
        return dp[left];
    }
}
