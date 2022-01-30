package Leetcode;

public class Num189 {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        if(size == 1){
            return;
        }
        for (int i = 0; i < (k%size); i++) {
            fun(nums,size);
        }
    }
    public int[] fun(int[] nums,int size){
        int last = nums[size-1];
        for (int i = size-1; i >= 1; i--) {
            nums[i] = nums[i-1];
        }
        nums[0] = last;
        return nums;
    }
}
