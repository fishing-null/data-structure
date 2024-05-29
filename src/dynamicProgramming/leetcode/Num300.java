package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Num300 {
    public static void main(String[] args) {

    }
    public int lengthOfLIS(int[] nums) {
        //初始化dp数组
        int length = nums.length;
        int[] dp = new int[length];
        Arrays.fill(dp,1);
        int maxLength = 0;
        //处理边界
        if (length == 1) return 1;
        for(int i = 0;i < length;i++){
            for(int j = 0;j < i;j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
                maxLength = Math.max(maxLength,dp[i]);
            }
        }
        return maxLength;
    }
}
