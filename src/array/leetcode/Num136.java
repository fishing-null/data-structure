package array.leetcode;

public class Num136 {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }
}
