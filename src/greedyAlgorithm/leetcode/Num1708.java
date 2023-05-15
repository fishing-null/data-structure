package greedyAlgorithm.leetcode;

import java.util.*;

public class Num1708 {
    public static void main(String[] args) {
        Num1708 num1708 = new Num1708();
        num1708.largestSubarray(new int[] {1,4,5,2,3},3);

    }
    public int[] largestSubarray(int[] nums, int k) {
//        int len = nums.length;
//        Queue<int[]> queue = new ArrayDeque<>();
//        for (int i = 0; i <= len-k; i++) {
//            int[] tmp = Arrays.copyOfRange(nums,i,i+k);
//            queue.add(tmp);
//        }
//        int[] maxArray = new int[len];
//        int tmp = 0;
//        for(int[] ret:queue){
//            if(ret[0] > tmp){
//                maxArray = ret;
//                tmp = ret[0];
//            }
//        }
//        return maxArray;
        int max = 0;
        int index = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        return Arrays.copyOfRange(nums,index,index + k);
    }
}
