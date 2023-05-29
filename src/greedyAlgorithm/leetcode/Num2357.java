package greedyAlgorithm.leetcode;

import java.util.Arrays;

public class Num2357 {
    public static void main(String[] args) {
        Num2357 num2357 = new Num2357();
        num2357.minimumOperations(new int[] {1,5,0,3,5});

    }
    public int minimumOperations(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int[] ret = new int[101];
        int len = nums.length;
        int ans = 0;
        for(int num:nums){
            if(num != 0 && ++ret[num] == 1){
                ans++;
            }
        }
        return ans;
    }
}
