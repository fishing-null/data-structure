package array.leetcode;

public class Num189 {
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
        //时间复杂度O(N) 空间复杂度O(N)
//        int[] ret = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ret[i] = nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int index = (i+k)% nums.length;
//            nums[index] = ret[i];
//        }
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start < end){
            int tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }
}
