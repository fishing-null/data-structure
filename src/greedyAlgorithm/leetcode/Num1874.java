package greedyAlgorithm.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Num1874 {
    public static void main(String[] args) {

    }
    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int sum = 0;
        for (int i = 0,j = nums1.length-1; i < nums1.length; i++,j--) {
            sum += nums1[i]*nums2[j];
        }
        return sum;
    }
}
