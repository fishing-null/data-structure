package dynamicProgramming.leetcode;

public class Num377 {
    public static void main(String[] args) {
        Num377 num377 = new Num377();
        num377.combinationSum4(new int[] {1,2,3},4);

    }
    public int combinationSum4(int[] nums, int target) {
        int len = nums.length;
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < len; j++) {
                if(i >= nums[j]){
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
