package dynamicProgramming.leetcode;

public class Offer1716 {
    public static void main(String[] args) {

    }
    public int massage(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        int dp0 = 0;
        int dp1 = nums[0];
        for (int i = 1; i < len; i++) {
            int tdp0 = Math.max(dp0,dp1);
            int tdp1 = dp0+nums[i];
            dp0 = tdp0;
            dp1 = tdp1;
        }
        return Math.max(dp0,dp1);
    }
}
