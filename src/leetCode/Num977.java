package leetCode;

import java.util.Arrays;

public class Num977 {
    public static void main(String[] args) {
        sortedSquares(new int[] {-7,-3,2,3,11});
    }
    public static int[] sortedSquares(int[] nums) {
        int[] ret = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int length = nums.length-1;
        while(left <= right && length >= 0){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ret[length--] = nums[left]*nums[left];
                left++;
            }else{
                ret[length--] = nums[right]*nums[right];
                right--;
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            ret[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(ret);
        return ret;
    }
}
