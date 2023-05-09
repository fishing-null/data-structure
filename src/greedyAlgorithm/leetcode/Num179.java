package greedyAlgorithm.leetcode;

import java.util.Arrays;

public class Num179 {
    public static void main(String[] args) {

    }
    public String largestNumber(int[] nums) {
        int length= nums.length;
        String [] strings = new String[length];
        for (int i = 0; i < length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strings,(a,b)-> (b+a).compareTo(a+b));
        String ret = String.join("",strings);
        return ret.charAt(0) == '0' ? "0" : ret;
    }
}
