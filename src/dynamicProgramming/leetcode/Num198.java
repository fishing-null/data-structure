package dynamicProgramming.leetcode;

public class Num198 {
    public static void main(String[] args) {

    }
    public int rob(int[] nums) {
        int first = nums[0];
        if(nums.length == 1){
            return first;
        }
        int second = Math.max(nums[1],nums[0]);
        if(nums.length == 2){
            return second;
        }
        for (int i = 2; i < nums.length; i++) {
            int tmp = second;
            second = Math.max(second,first+nums[i]);
            first = tmp;
        }
        return second;
    }
}
