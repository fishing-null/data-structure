package array.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Num2457 {
    public static void main(String[] args) {
        Num2457 num2457 = new Num2457();
        num2457.unequalTriplets(new int[] {4,4,2,4,3});

    }
    public int unequalTriplets(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length,ret = 0;
        for (int i = 0,j = 0; i < n ; i = j) {
            while (j < n && nums[i] == nums[j]){
                j++;
            }
            ret += i*(j-i)*(n-j);
        }
        return ret;
    }
}
