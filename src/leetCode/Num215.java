package leetCode;

import java.util.*;

public class Num215 {
    public static void main(String[] args) {

    }
    public  int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
