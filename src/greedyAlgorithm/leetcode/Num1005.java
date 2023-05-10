package greedyAlgorithm.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Num1005 {
    public static void main(String[] args) {
        Num1005 num1005 = new Num1005();
        num1005.largestSumAfterKNegations(new int[] {2,-3,-1,5,-4},2);

    }
    public int largestSumAfterKNegations(int[] nums, int k) {
//        nums = IntStream.of(nums).boxed().sorted((o1,o2) -> Math.abs(o2) - Math.abs(o1)).mapToInt(Integer::intValue).toArray();
//        int len = nums.length;
//        for (int i = 0; i < len; i++) {
//            if(nums[i] < 0 && k > 0){
//                nums[i] = -nums[i];
//                k--;
//            }
//        }
//        if(k%2 == 1){
//            nums[len-1] = -nums[len-1];
//        }
//        return Arrays.stream(nums).sum();
        Arrays.sort(nums);
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i] < 0) {
                count++;
            }
        }
        int ret = 0;
        if(k >= count){
            k -= count;
            for (int i = 0; i < len; i++) {
                if(nums[i] < 0){
                    nums[i] = -nums[i];
                }
            }
            Arrays.sort(nums);
            if(k != 0 && k % 2 == 1){
                nums[0] = -nums[0];
            }
            for (int i = 0; i < len; i++) {
                ret += nums[i];
            }
        }else{
            for (int i = 0; i < len; i++) {
                if(i < k){
                    ret += (-nums[i]);
                }else{
                    ret += nums[i];
                }
            }
        }
        return ret;
    }
}
