package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Num217 {
    class Solution {
        //1.解法1,双层循环超时
//        public boolean containsDuplicate(int[] nums) {
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = nums.length-1; j > i; j--) {
//                    if(nums[i] == nums[j]){
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
        //2.
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }
            if(set.size() <= nums.length){
                return true;
            }
            return false;
        }
    }
}
