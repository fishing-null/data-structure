package greedyAlgorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Num1005 {
    public static void main(String[] args) {
        Num1005 num1005 = new Num1005();
        num1005.largestSumAfterKNegations(new int[] {3,-1,0,2},3);

    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums).boxed().sorted((o1,o2) -> Math.abs(o2) - Math.abs(o1)).mapToInt(Integer::intValue).toArray();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] < 0 && k > 0){
                nums[i] = -nums[i];
                k--;
            }
        }
        if(k%2 == 1){
            nums[len-1] = -nums[len-1];
        }
        return Arrays.stream(nums).sum();
    }
}
