package dynamicProgramming.leetcode;

public class Num416 {
    public static void main(String[] args) {

    }
    public boolean canPartition(int[] nums) {
        if(nums.length == 0 || nums == null){
            return false;
        }
        int sum=0;
        int len = nums.length;
        for (int num:nums) {
            sum += num;
        }
        int target = sum / 2;
        if(sum % 2 != 0) return false;
        int[] dp = new int[target+1];
        for (int i = 0; i < len; i++) {
            for (int j = target; j >= nums[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j-nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }
}
