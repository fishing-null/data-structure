package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Num213 {
    public static void main(String[] args) {
        int[] arr = {200,3,140,20,10};
        rob(arr);
    }
    public static int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        return Math.max(robFun(Arrays.copyOfRange(nums,0,nums.length-1)),robFun(Arrays.copyOfRange(nums,1,nums.length)));
    }
    public static int robFun(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[1],nums[0]);
        }
        int first = nums[0];
        int second = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int tmp = second;
            second = Math.max(nums[i]+first,second);
            first = tmp;
        }
        return second;
    }
}
