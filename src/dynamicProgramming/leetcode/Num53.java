package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Num53 {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        //初始化dp数组
        int n = nums.length;
        //处理边界值
        if(n == 1) return nums[0];
        //dp[i]表示第i个元素结尾时其所有子数组的最大和
        int[] dp = new int[n+1];
        dp[0] = 0;
        int maxSum = -1000000;
        //状态转移
        for(int i = 1;i < n + 1;i++){
            dp[i] = Math.max(nums[i-1],dp[i-1] + nums[i-1]);
            if(dp[i] > maxSum) maxSum = dp[i];
        }
        return maxSum;
    }
}
