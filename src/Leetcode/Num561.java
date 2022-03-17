package Leetcode;

import java.util.Arrays;

public class Num561 {
    public int arrayPairSum(int[] nums) {
        if(nums.length == 2){
            return Math.min(nums[1],nums[0]);
        }
        Arrays.sort(nums);
        int ret = 0;
        for (int i = 0; i < nums.length-1; i=i+2) {
            ret += Math.min(nums[i],nums[i+1]);
        }
        return ret;
    }
}
