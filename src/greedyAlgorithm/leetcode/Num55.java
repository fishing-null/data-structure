package greedyAlgorithm.leetcode;

public class Num55 {
    public static void main(String[] args) {
        Num55 num55 = new Num55();
        num55.canJump(new int[] {2,0,0});

    }
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int max = -1;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = nums[i] + i;
        }
        for (int i = 0; i < nums.length;i++) {
            max = Math.max(dp[i],max);
            if(max >= nums.length - 1){
                return true;
            }
            if(i == max){
                return false;
            }
        }
        return false;
    }
}
