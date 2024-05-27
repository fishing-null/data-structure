package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Num918 {
    public static void main(String[] args) {
        Num918 num918 = new Num918();
        num918.maxSubarraySumCircular(new int[] {-3,-2,-3});

        System.out.println(num918.maxSubarraySumCircular(new int[] {-3,-2,-3}));
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int ret1 = maxSubArray(nums);
        int ret2 = minSubArray(nums);
        return sum == ret2 ? ret1 : Math.max(ret1,sum-ret2);
    }
    public int maxSubArray(int[] nums) {
        //初始化dp数组
        int n = nums.length;
        //处理边界值
        if(n == 1) return nums[0];
        int[] dp = new int[n+1];
        dp[0] = 0;
        int maxSum = Integer.MIN_VALUE;
        //状态转移
        for(int i = 1;i < n + 1;i++){
            dp[i] = Math.max(nums[i-1],dp[i-1] + nums[i-1]);
            if(dp[i] > maxSum) maxSum = dp[i];
        }
        return maxSum;
    }
    public int minSubArray(int[] nums) {
        //初始化dp数组
        int n = nums.length;
        //处理边界值
        if(n == 1) return nums[0];
        int[] dp = new int[n+1];
        dp[0] = 0;
        int minSum = Integer.MAX_VALUE;
        //状态转移
        for(int i = 1;i < n + 1;i++){
            dp[i] = Math.min(nums[i-1],dp[i-1] + nums[i-1]);
            if(dp[i] < minSum) minSum = dp[i];
        }
        return minSum;
    }
}
