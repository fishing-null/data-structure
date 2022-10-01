package seqList.leetcode;

import java.util.Arrays;

public class Num27 {
    public static void main(String[] args) {
        int[] arr = {4,4,0,1,0,2};
        removeElement(arr,0);
    }
    public static int removeElement(int[] nums, int val) {
        int low = 0;
        int fast = 1;
        for (fast = 1; fast < nums.length; fast++) {
            if(nums[fast] != val){
                nums[low++] = nums[fast];
            }
        }
        return low;
    }
}
