package array.leetcode;

import java.util.Arrays;

public class Num169 {
    public int majorityElement(int[] nums) {
//        if(nums.length == 1){
//            return nums[0];
//        }
//        Arrays.sort(nums);
//        int i = 0;
//        int count = 1;
//        while(i < nums.length -1){
//            if(nums[i] == nums[i+1]){
//                count++;
//                if(count > nums.length/2){
//                    return nums[i];
//                }
//            }else{
//                count = 1;
//            }
//            i++;
//        }
//        return -1;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
