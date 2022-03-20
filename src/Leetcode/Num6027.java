package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Num6027 {
    public int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length-1; i++) {
            int k = i-1;
            int j = i+1;
            while(nums[i] == nums[j] && j< nums.length-1){
                i++;
                j++;
            }
            if(nums[i]>nums[j] && nums[i]>nums[k]){
                count ++;
            }
            if(nums[i]<nums[j] && nums[i] < nums[k]){
                count ++;
            }
        }
        return count;
    }
}
