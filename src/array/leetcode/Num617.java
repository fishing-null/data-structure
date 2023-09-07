package array.leetcode;

import java.util.Arrays;

public class Num617 {
    public static void main(String[] args) {

    }
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while (left < right){
                if(check(nums[left],nums[right],nums[i])){
                    count += right - left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;
    }

    private boolean check(int left, int right, int fixed) {
        if(left + right > fixed){
            return true;
        }
        return false;
    }
}
