package array.leetcode;

public class Num189 {
    public static void main(String[] args) {

    }
    public void rotate(int[] nums, int k) {
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ret[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int index = (i+k)% nums.length;
            nums[index] = ret[i];
        }
    }
}
