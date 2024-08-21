package binary.leetcode;

import java.util.Arrays;

public class Num268 {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0,right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == mid ){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return nums[left] == left ? left + 1 : left;
    }
}
