package dynamicProgramming.leetcode;

import java.util.Arrays;

public class Num53 {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]>0){
                nums[i] = nums[i]+nums[i-1];
            }
        }
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
