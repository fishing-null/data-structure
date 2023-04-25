package sort.leetcode;

import java.util.Arrays;

public class Num280 {
    public static void main(String[] args) {
        Num280 num280 = new Num280();
        num280.wiggleSort(new int[] {1,2,3,4,5,6});

    }
    public void wiggleSort(int[] nums) {
        if(nums.length == 1){
            return;
        }
        int left = 0,right = nums.length-1;
        Arrays.sort(nums);
        int[] ret = new int[nums.length];
        int index = 0;
        while(left <= right){
            ret[index] = nums[left];
            if(index+1 <= nums.length-1){
                ret[index+1] = nums[right];
            }
            left++;
            right--;
            index += 2;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ret[i];
        }
    }
}
