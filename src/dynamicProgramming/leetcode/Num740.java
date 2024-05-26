package dynamicProgramming.leetcode;

import hash.leetcode.Num760;

import java.util.Arrays;

public class Num740 {
    public static void main(String[] args) {
        Num740 num740 = new Num740();
        num740.deleteAndEarn(new int[] {2,2,3,3,3,4});


    }
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        //对数组进行预处理
        int[] arr = new int[nums[nums.length-1]];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1] += nums[i];
        }
        //处理边界
        if(nums.length == 1) return nums[0];
        //定义dp数组
        int n = arr.length;
        int[] dp0 = new int[n];
        int[] dp1 = new int[n];
        //初始化
        dp0[0] = 0;
        dp1[0] = arr[0];
        //状态转移
        for (int i = 1; i < arr.length; i++) {
            dp1[i] = dp0[i-1] + arr[i];
            dp0[i] = Math.max(dp1[i-1],dp0[i-1]);
        }
        //返回值
        return Math.max(dp1[n-1],dp0[n-1]);
    }
}
